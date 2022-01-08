package org.docksidestage.app.application;

import java.util.List;

import org.docksidestage.app.application.security.UserBeanArgumentResolver;
import org.docksidestage.bizfw.GodHandableInterceptor;
import org.docksidestage.bizfw.RequestLoggingFilter;
import org.docksidestage.bizfw.thymeleaf.AppProcessorDialect;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.dialect.IProcessorDialect;

/**
 * SpringMVC関連の設定クラス。<br>
 * (web周りなので、DBFluteとは無関係の設定ばかり)
 * @author jflute
 * @author inoue
 * @author subaru
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    /**
     * リクエストのログ制御のためのServletFilterを登録するBean定義。<br>
     * こうすることで、RequestLoggingFilterがServletFilterとして登録されるようになる。<br>
     * これにてデバッグログやエラーログが充実する。
     * @return ServletFilter登録用のBean. (NotNull)
     */
    @Bean
    public FilterRegistrationBean<RequestLoggingFilter> filterRequestLogging() { // for logging
        FilterRegistrationBean<RequestLoggingFilter> registrationBean = new FilterRegistrationBean<>();
        RequestLoggingFilter loggingFilter = new RequestLoggingFilter();
        registrationBean.setFilter(loggingFilter);
        registrationBean.setOrder(1);
        return registrationBean;
    }

    /**
     * {@inheritDoc} <br>
     * Controllerクラス関連の前後処理のためのInterceptorを登録する。(ってニュアンスでいいのかな？)
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) { // for logging
        // Controllerクラスのログ制御やDBFluteの共通カラム自動設定の有効化などを司るInterceptorを登録
        registry.addInterceptor(new GodHandableInterceptor()).addPathPatterns("/**");
    }

    /**
     * アプリのメッセージ設定ファイルが登録されたメッセージソースを登録するBean定義。
     * @return ResouceBundleのメッセージソース (NotNull)
     */
    @Bean
    public MessageSource messageSource() {
        // #thinking jflute Springでのメッセージリソースの管理のオーソドックスなやり方がわからない (2022/01/08)
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        // #needs_fix jflute ここはharborじゃないので、example!?とか何か違う名前にしたい (2022/01/08)
        // #thinking jflute 二つのファイルを指定すると、マージされるのかな？同じキーがあったらどうなる？ (2022/01/08)
        messageSource.addBasenames("harbor_label", "harbor_message");
        return messageSource;
    }

    /**
     * {@inheritDoc} <br>
     * Controllerクラスの引数に独自の型を指定できるように解決するResolverを追加する。(ってニュアンスでいいのかな？)
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new UserBeanArgumentResolver()); // ログイン情報を保持するUserBeanクラスのResolver
    }

    /**
     * ThymeleafのDialectを登録するBean定義。
     * @return アプリ独自のDialect (NotNull)
     */
    @Bean
    public IProcessorDialect appProcessorDialect() { // for thymeleaf
        return new AppProcessorDialect("appProcessorDialect", "ex", 1000);
    }
}
