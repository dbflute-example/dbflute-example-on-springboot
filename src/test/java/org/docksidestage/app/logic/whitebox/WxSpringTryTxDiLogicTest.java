package org.docksidestage.app.logic.whitebox;

import org.docksidestage.unit.UnitContainerTestCase;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jflute
 */
public class WxSpringTryTxDiLogicTest extends UnitContainerTestCase {

    @Autowired
    private WxSpringTryTxDiLogic logic;

    @Override
    protected boolean isSuppressTestCaseTransaction() {
        return true;
    }

    public void test_call() {
        logic.publicMethod();
        logic.protectedMethod();
        logic.packagePrivateMethod();
    }
}
