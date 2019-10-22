package org.docksidestage.app.application.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.ForwardAuthenticationFailureHandler;

/**
 * @author inoue on 2016/12/18.
 * @author jflute
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // #for_now for test, enable later by jflute
        // @formatter:off
        http.authorizeRequests()
                .antMatchers("/signin", "/signin/", "/signup", "/signup/", "/product/list", "/product/list/")
                .permitAll()
                .antMatchers("/css/**", "/js/**", "/images/**")
                .permitAll()
                .antMatchers("/lido/product/list", "/lido/product/list/")
                .permitAll()
                .anyRequest()
                .authenticated();

        http.formLogin()
                .loginPage("/signin")
                .loginProcessingUrl("/signin")
                .defaultSuccessUrl("/member/list")
                .failureUrl("/signin")
                .failureHandler(new ForwardAuthenticationFailureHandler("/signin"))
                .usernameParameter("account")
                .passwordParameter("password")
                .permitAll()
                .and()
             .logout()
                .logoutUrl("/signout/")
                .logoutSuccessUrl("/signin/")
                .permitAll();
        // @formatter:on
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder()); // 既存のsampleプロジェクトに合わせる
    }

    /**
     * パスワードエンコーダを生成する.
     * 最近のSpringだとBCryptを推奨しているがセキュリティ要件に合わせること.
     * harborに合わせてSHA-256を利用する.
     * 非推奨だが削除予定はないのでSpring Security標準付属のエンコーダを利用した.
     *
     * https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#other-passwordencoders
     * @return The password encoder for security handling, which is used by framework. (NotNull)
     */
    @SuppressWarnings("deprecation")
    @Bean
    public PasswordEncoder passwordEncoder() {
        // #thinking jflute fitting with harbor example but deprecated in Spring framework (2019/10/22)
        return new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("SHA-256");
    }
}
