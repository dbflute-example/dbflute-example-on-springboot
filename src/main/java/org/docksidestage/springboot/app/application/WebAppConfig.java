package org.docksidestage.springboot.app.application;

import org.dbflute.svflute.web.controller.interceptor.GodHandableControllerInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author jflute
 */
@Component
public class WebAppConfig extends WebMvcConfigurerAdapter {

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new GodHandableControllerInterceptor()).addPathPatterns("/**");
    }
}
