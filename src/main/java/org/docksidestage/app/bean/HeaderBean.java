package org.docksidestage.app.bean;

/**
 * @author jflute
 */
public class HeaderBean { // #change_it #delete_ifapi

    private static final HeaderBean EMPTY_INSTANCE = new HeaderBean();

    public final Integer memberId;
    public final String memberName;
    public final boolean isLogin;

    private HeaderBean() {
        this.memberId = null;
        this.memberName = null;
        this.isLogin = false;
    }

    public HeaderBean(UserBean userBean) {
        this.memberId = userBean.getMemberId();
        this.memberName = userBean.getMemberName();
        this.isLogin = true;
    }

    public static HeaderBean empty() {
        return EMPTY_INSTANCE;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{").append(memberId);
        sb.append(",").append(memberName);
        if (isLogin) {
            sb.append(", login");
        }
        sb.append("}");
        return sb.toString();
    }
}
