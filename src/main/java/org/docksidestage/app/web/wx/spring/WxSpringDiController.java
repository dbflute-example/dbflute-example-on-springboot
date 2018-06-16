package org.docksidestage.app.web.wx.spring;

import java.util.Arrays;
import java.util.List;

import org.docksidestage.app.logic.wx.WxSpringTryTxDiLogic;
import org.docksidestage.dbflute.exbhv.MemberBhv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * white-box try
 * @author jflute
 */
@Controller
@RequestMapping("/wx/spring/di")
public class WxSpringDiController {

    private static final Logger logger = LoggerFactory.getLogger(WxSpringDiController.class);

    @Autowired
    private MemberBhv memberBhv;
    @Autowired
    private WxSpringTryTxDiLogic springTryTxDiLogic;

    // http://localhost:8080/wx/spring/di/controller
    @RequestMapping(method = RequestMethod.GET, value = "controller")
    @ResponseBody
    @Transactional
    public List<String> controller() {
        logger.debug("#white getClass(): {}", getClass());
        logger.debug("#white memberBhv: {}", memberBhv);
        sea();
        land();
        piari();
        bonvo();
        return Arrays.asList("sea", "land", "piari");
    }

    public int sea() {
        logger.debug("#white ...Calling public method(sea): {}", getClass());
        return memberBhv.selectCount(cb -> {});
    }

    protected int land() {
        logger.debug("#white ...Calling protected method(land): {}", getClass());
        return memberBhv.selectCount(cb -> {});
    }

    int piari() {
        logger.debug("#white ...Calling package-private method(piari): {}", getClass());
        return memberBhv.selectCount(cb -> {});
    }

    private int bonvo() {
        logger.debug("#white ...Calling private method(bonvo): {}", getClass());
        return memberBhv.selectCount(cb -> {});
    }

    // http://localhost:8080/wx/spring/di/logic
    @RequestMapping(method = RequestMethod.GET, value = "logic")
    @ResponseBody
    public List<String> logic() {
        logger.debug("#white getClass(): {}", getClass());
        logger.debug("#white springTryTxDiLogic: {}", springTryTxDiLogic);
        springTryTxDiLogic.sea();
        springTryTxDiLogic.delegateCloset();
        return Arrays.asList("sea", "land", "piari");
    }
}
