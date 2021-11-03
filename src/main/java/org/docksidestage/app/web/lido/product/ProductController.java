package org.docksidestage.app.web.lido.product;

// the 'lido' package is example for JSON API in simple project
// client application is riot.js in lidoisle directory

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.dbflute.cbean.result.PagingResultBean;
import org.docksidestage.app.utils.ExampleStringUtils;
import org.docksidestage.app.web.base.ApiBaseController;
import org.docksidestage.app.web.base.paging.PagingAssist;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exbhv.ProductBhv;
import org.docksidestage.dbflute.exentity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author y.shimizu
 * @author jflute
 */
@RestController
@RequestMapping("/lido/product")
public class ProductController extends ApiBaseController {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    private ProductBhv productBhv;
    @Autowired
    private PagingAssist pagingAssist;

    // ===================================================================================
    //                                                                     Request Mapping
    //                                                                     ===============
    // #thinking jflute generic cannot be business type because of error response... (2019/10/22)
    @GetMapping("/list")
    public ResponseEntity<? extends Object> list(Optional<Integer> pageNumber, @Valid ProductSearchBody body, BindingResult result) {
        if (pageNumber.isPresent() && pageNumber.get() <= 0) {
            return clientError();
        }

        if (ExampleStringUtils.isNotEmpty(body.getProductStatus()) && !CDef.ProductStatus.of(body.getProductStatus()).isPresent()) {
            return clientError();
        }

        if (result.hasErrors()) {
            return validationError(result);
        }

        PagingResultBean<Product> page = selectProductPage(pageNumber.orElse(1), body);
        List<ProductRowResult> items = page.stream().map(product -> {
            return mappingToBean(product);
        }).collect(Collectors.toList());

        return ResponseEntity.ok(pagingAssist.createPagingResult(page, items));
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private PagingResultBean<Product> selectProductPage(int pageNumber, ProductSearchBody body) {
        Assert.isTrue(pageNumber > 0, "The pageNumber should be positive number: " + pageNumber);

        return productBhv.selectPage(cb -> {
            cb.setupSelect_ProductStatus();
            cb.setupSelect_ProductCategory();
            cb.specify().derivedPurchase().count(purchaseCB -> {
                purchaseCB.specify().columnPurchaseId();
            }, Product.ALIAS_purchaseCount);
            if (ExampleStringUtils.isNotEmpty(body.getProductName())) {
                cb.query().setProductName_LikeSearch(body.getProductName(), op -> op.likeContain());
            }
            if (ExampleStringUtils.isNotEmpty(body.getPurchaseMemberName())) {
                cb.query().existsPurchase(purchaseCB -> {
                    purchaseCB.query().queryMember().setMemberName_LikeSearch(body.getPurchaseMemberName(), op -> op.likeContain());
                });
            }
            if (body.getProductStatus() != null) {
                cb.query().setProductStatusCode_Equal_AsProductStatus(CDef.ProductStatus.of(body.getProductStatus()).get());
            }
            cb.query().addOrderBy_ProductName_Asc();
            cb.query().addOrderBy_ProductId_Asc();
            cb.paging(Integer.MAX_VALUE, pageNumber); // #later: waiting for client side implementation by jflute
        });
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private ProductRowResult mappingToBean(Product product) {
        ProductRowResult bean = new ProductRowResult();
        bean.productId = product.getProductId();
        bean.productName = product.getProductName();
        product.getProductStatus().alwaysPresent(status -> {
            bean.productStatusName = status.getProductStatusName();
        });
        bean.regularPrice = product.getRegularPrice();
        return bean;
    }
}
