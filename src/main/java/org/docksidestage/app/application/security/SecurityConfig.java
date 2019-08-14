package org.docksidestage.app.application.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
        http.authorizeRequests()
                .antMatchers("/signin", "/signin/", "/signup", "/signup/", "/product/list", "/product/list/")
                .permitAll()
                .antMatchers("/css/**", "/js/**", "/images/**").permitAll().antMatchers("/lido/product/list", "/lido/product/list/")
                .permitAll()
                .anyRequest()
                .authenticated();

        http.formLogin()
                .loginProcessingUrl("/signin")
                .defaultSuccessUrl("/member/list")
                .failureUrl("/signin")
                .failureHandler(new ForwardAuthenticationFailureHandler("/signin"))
                .usernameParameter("account")
                .passwordParameter("password")
                .permitAll()
                .loginPage("/signin")
                .and()
                .logout()
                .logoutSuccessUrl("/login")
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder()); // 既存のsampleプロジェクトに合わせる
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
