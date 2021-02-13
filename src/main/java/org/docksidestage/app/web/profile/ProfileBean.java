package org.docksidestage.app.web.profile;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.docksidestage.dbflute.exentity.Member;
import org.docksidestage.dbflute.exentity.MemberService;
import org.docksidestage.dbflute.exentity.Purchase;

/**
 * @author y.shimizu
 */
public class ProfileBean {

    final private String memberName;
    final private String memberStatusName;
    final private Integer servicePointCount;
    final private String serviceRankName;

    final private List<PurchasedProductBean> purchaseList;

    public ProfileBean(Member member) {
        this.memberName = member.getMemberName();
        this.memberStatusName = member.getMemberStatus().get().getMemberStatusName();
        MemberService memberService = member.getMemberServiceAsOne().get();
        this.servicePointCount = memberService.getServicePointCount();
        this.serviceRankName = memberService.getServiceRank().get().getServiceRankName();

        this. purchaseList = member.getPurchaseList().stream().map(purchase -> {
            return new ProfileBean.PurchasedProductBean(purchase);
        }).collect(Collectors.toList());
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberStatusName() {
        return memberStatusName;
    }

    public Integer getServicePointCount() {
        return servicePointCount;
    }

    public String getServiceRankName() {
        return serviceRankName;
    }

    public List<PurchasedProductBean> getPurchaseList() {
        return purchaseList;
    }

    public static class PurchasedProductBean {
        final private String productName;
        final private Integer regularPrice;
        final private LocalDateTime purchaseDateTime;

        public PurchasedProductBean(Purchase purchase) {
            this.productName = purchase.getProduct().get().getProductName();
            this.regularPrice = purchase.getProduct().get().getRegularPrice();
            this.purchaseDateTime = purchase.getPurchaseDatetime();
        }

        public String getProductName() {
            return productName;
        }

        public Integer getRegularPrice() {
            return regularPrice;
        }

        public LocalDateTime getPurchaseDateTime() {
            return purchaseDateTime;
        }

    }
}
