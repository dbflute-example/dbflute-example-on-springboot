package org.docksidestage.app.web.wx.json;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * white-box try
 * @author jflute
 */
@Controller
@RequestMapping("/wx/scalar")
public class WxScalarController {

    // http://localhost:8080/wx/scalar/string
    @RequestMapping(method = RequestMethod.GET, value = "string")
    @ResponseBody
    public String string() { // contentType=text/html
        return "sea";
    }

    // http://localhost:8080/wx/scalar/integer
    @RequestMapping(method = RequestMethod.GET, value = "integer")
    @ResponseBody
    public Integer integer() { // contentType=application/json
        return 1;
    }

    // integer with produces => error page: httpStatus=406 ; contentType=null
    //// http://localhost:8080/wx/scalar/integer
    //@RequestMapping(method = RequestMethod.GET, value = "integer", produces = "text/plain;charset=UTF-8")
    //@ResponseBody
    //public Integer integer() { // httpStatus=406 ; contentType=null
    //    return 1;
    //}

    // http://localhost:8080/wx/scalar/date
    @RequestMapping(method = RequestMethod.GET, value = "date")
    @ResponseBody
    public LocalDate date() { // contentType=application/json
        return LocalDate.now();
    }
}
