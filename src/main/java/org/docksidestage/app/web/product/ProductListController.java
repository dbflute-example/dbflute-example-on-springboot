package org.docksidestage.app.web.product;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dbflute.cbean.result.PagingResultBean;
import org.docksidestage.app.utils.ExampleStringUtils;
import org.docksidestage.dbflute.allcommon.CDef;
import org.docksidestage.dbflute.exbhv.ProductBhv;
import org.docksidestage.dbflute.exentity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author subaru
 */
@Controller
@RequestMapping("/product/list")
public class ProductListController {
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Autowired
    private ProductBhv productBhv;

    @ModelAttribute
    public List<CDef.ProductStatus> productStatusList() {
        return CDef.ProductStatus.listAll();
    }

    @GetMapping({ "/", "/{pageNumber}" })
    public String index(Model model, @PathVariable("pageNumber") Optional<Integer> pageNumber,
            @ModelAttribute(name = "searchForm") @Validated ProductSearchForm searchForm, BindingResult br) {
        if (br.hasErrors()) {
            model.addAttribute("beans", Collections.emptyList());
            return "product/product_list";
        }
        PagingResultBean<Product> page = selectProductPage(pageNumber.orElse(1), searchForm);
        List<ProductSearchRowBean> beans = page.stream().map(product -> {
            return mappingToBean(product);
        }).collect(Collectors.toList());

        model.addAttribute("beans", beans);
        return "product/product_list";
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private PagingResultBean<Product> selectProductPage(int pageNumber, ProductSearchForm form) {
        return productBhv.selectPage(cb -> {
            cb.setupSelect_ProductStatus();
            cb.setupSelect_ProductCategory();
            cb.specify().derivedPurchase().max(purchaseCB -> {
                purchaseCB.specify().columnPurchaseDatetime();
            }, Product.ALIAS_latestPurchaseDate);
            if (ExampleStringUtils.isNotEmpty(form.getProductName())) {
                cb.query().setProductName_LikeSearch(form.getProductName(), op -> op.likeContain());
            }
            if (ExampleStringUtils.isNotEmpty(form.getPurchaseMemberName())) {
                cb.query().existsPurchase(purchaseCB -> {
                    purchaseCB.query().queryMember().setMemberName_LikeSearch(form.getPurchaseMemberName(), op -> op.likeContain());
                });
            }
            if (ExampleStringUtils.isNotEmpty(form.getProductStatus())) {
                cb.query().setProductStatusCode_Equal_AsProductStatus(CDef.ProductStatus.codeOf(form.getProductStatus()));
            }
            cb.query().addOrderBy_ProductName_Asc();
            cb.query().addOrderBy_ProductId_Asc();
            cb.paging(4, pageNumber);
        });
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private ProductSearchRowBean mappingToBean(Product product) {
        ProductSearchRowBean bean = new ProductSearchRowBean();
        bean.setProductId(product.getProductId());
        bean.setProductName(product.getProductName());
        product.getProductStatus().alwaysPresent(status -> {
            bean.setProductStatus(status.getProductStatusName());
        });
        product.getProductCategory().alwaysPresent(category -> {
            bean.setProductCategory(category.getProductCategoryName());
        });
        bean.setRegularPrice(product.getRegularPrice());
        bean.setLatestPurchaseDate(product.getLatestPurchaseDate());
        return bean;
    }
}
