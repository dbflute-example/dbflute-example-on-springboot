package org.docksidestage.app.aop;

import org.docksidestage.app.bean.HeaderBean;
import org.docksidestage.app.bean.UserBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * ExampleプロジェクトにおけるControllerクラスの横断アドバイス。<br>
 * 共通のModelなどを定義する。
 * @author subaru
 * @author jflute
 */
@ControllerAdvice
public class ExampleControllerAdvice {

    // #thinking jflute UserBeanArgumentResolver で UserBean をパラメーター解決してるから、ここで引数で受け取れるでOK？ (2022/01/08)
    /**
     * @param userBean ログインユーザーの情報を保持したオブジェクト (NullAllowed: ログインしてないとき)
     * @return 画面のヘッダーに表示するためのデータを保持したオブジェクト (NotNull, EmptyAllowed)
     */
    @ModelAttribute
    public HeaderBean headerBean(UserBean userBean) {
        if (userBean != null) {
            return new HeaderBean(userBean);
        }
        // #thinking jflute ログインしてなければnullになる？Optional<UserBean>にできなかったっけ (2022/01/08)
        return HeaderBean.empty();
    }
}
