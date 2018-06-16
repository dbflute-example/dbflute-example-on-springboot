package org.docksidestage.app.logic.wx;

import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * white-box try
 * @author jflute
 */
@Component
@Transactional
public class WxSpringTryTxDiLogic {

    private static final Logger logger = LoggerFactory.getLogger(WxSpringTryTxDiLogic.class);

    @Autowired
    private MemberBhv memberBhv;

    public int sea() {
        logger.debug("#white ...Calling public method(sea): {}", getClass());
        int count = memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
        return count;
    }

    public void delegateCloset() {
        land();
        piari();
        bonvo();
    }

    protected int land() {
        logger.debug("#white ...Calling protected method(land): {}", getClass());
        return memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
    }

    int piari() {
        logger.debug("#white ...Calling package-private method(piari): {}", getClass());
        return memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
    }

    private int bonvo() {
        logger.debug("#white ...Calling private method(bonvo): {}", getClass());
        return memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
    }
}
