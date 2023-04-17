package org.docksidestage.app.application.security;

import org.docksidestage.app.web.signin.SigninService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.ForwardAuthenticationFailureHandler;

/**
 * @author inoue on 2016/12/18.
 * @author jflute
 * @author y.shimizu
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // #for_now for test, enable later by jflute
        // @formatter:off
        http.authorizeHttpRequests()
                .requestMatchers("/signin", "/signin/", "/signup", "/signup/", "/product/list", "/product/list/")
                .permitAll()
                .requestMatchers("/css/**", "/js/**", "/images/**")
                .permitAll()
                .requestMatchers("/lido/product/list", "/lido/product/list/")
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

        return http.build();
        // @formatter:on
    }


    public UserDetailsService userDetailsService() {
        return new SigninService();
    }

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http, PasswordEncoder encoder, UserDetailsService userDetailService)
            throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(userDetailsService())
                .passwordEncoder(encoder)
                .and()
                .build();
    }

    /**
     * パスワードエンコーダを生成する.
     * 最近のSpringだとBCryptを推奨しているがセキュリティ要件に合わせること.
     * harborに合わせてSHA-256を利用する.
     * 非推奨だが削除予定はないのでSpring Security標準付属のエンコーダを利用した.
     *
     * https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/crypto/password/MessageDigestPasswordEncoder.html
     * @return The password encoder for security handling, which is used by framework. (NotNull)
     */
    @SuppressWarnings("deprecation")
    @Bean
    public PasswordEncoder passwordEncoder() {
        // #thinking jflute fitting with harbor example but deprecated in Spring framework (2019/10/22)
        return new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("SHA-256");
    }
}
