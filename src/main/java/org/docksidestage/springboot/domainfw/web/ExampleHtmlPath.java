package org.docksidestage.springboot.domainfw.web;

import org.dbflute.svflute.web.controller.HtmlTemplatePath;

/**
 * The path definition of HTML template.
 * @author FreeGen
 */
public interface ExampleHtmlPath {

    /** The path of the template: /index.html */
    HtmlTemplatePath path_IndexHtml = new HtmlTemplatePath("/index.html");

    /** The path of the template: /login/login.html */
    HtmlTemplatePath path_Login_LoginHtml = new HtmlTemplatePath("/login/login.html");

    /** The path of the template: /member/member_list.html */
    HtmlTemplatePath path_Member_MemberListHtml = new HtmlTemplatePath("/member/member_list.html");
}
