package org.docksidestage.app.application;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.docksidestage.bizfw.GodHandableInterceptor;
import org.docksidestage.bizfw.RequestLoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author jflute
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

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

    @Bean(name = "dataSource")
    public DataSource createDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/maihamadb");
        ds.setUsername("root");
        ds.setPassword("");
        return ds;
    }
}
