package org.docksidestage.app.application;

import java.util.List;

import org.docksidestage.app.application.security.UserBeanArgumentResolver;
import org.docksidestage.bizfw.GodHandableInterceptor;
import org.docksidestage.bizfw.RequestLoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jflute
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() { // for logging
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        RequestLoggingFilter loggingFilter = new RequestLoggingFilter();
        registrationBean.setFilter(loggingFilter);
        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) { // for logging
        registry.addInterceptor(new GodHandableInterceptor()).addPathPatterns("/**");
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("harbor_label");
        return messageSource;
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new UserBeanArgumentResolver());
    }
}
