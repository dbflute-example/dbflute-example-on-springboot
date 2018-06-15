package org.docksidestage.app.logic.whitebox;

import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jflute
 */
@Component
@Transactional // #thinking how i use this? by jflute (2018/06/15)
public class WxSpringTryTxDiLogic {

    private static final Logger logger = LoggerFactory.getLogger(WxSpringTryTxDiLogic.class);

    @Autowired
    private MemberBhv memberBhv;

    public int publicMethod() {
        logger.debug("...Calling public method: {}", getClass().getName());
        return memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
    }

    protected int protectedMethod() {
        logger.debug("...Calling protected method: {}", getClass().getName());
        return memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
    }

    int packagePrivateMethod() {
        logger.debug("...Calling package-private method: {}", getClass().getName());
        return memberBhv.selectCount(cb -> {
            cb.query().setMemberStatusCode_Equal_Formalized();
        });
    }
}
