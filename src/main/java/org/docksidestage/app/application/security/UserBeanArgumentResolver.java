package org.docksidestage.app.application.security;

import org.docksidestage.app.bean.UserBean;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * ログイン情報を保持したクラスをControllerの引数で扱えるようにするResolver.
 * @author subaru
 * @author jflute
 */
public class UserBeanArgumentResolver implements HandlerMethodArgumentResolver {

    /**
     * {@inheritDoc} <br>
     * そのメソッドのパラメーターをサポートするかどうか？
     */
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return UserBean.class.isAssignableFrom(methodParameter.getParameterType());
    }

    /**
     * {@inheritDoc} <br>
     * 実際のリクエストから対象パラメーターのインスタンスを導く。そのインスタンスが引数に指定される。
     */
    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer,
            NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        return MemberUserDetail.userBean;
    }
}
