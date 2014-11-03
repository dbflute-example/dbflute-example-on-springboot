/*
 * Copyright 2014-2014 the original authorimport java.util.List;

import org.dbflute.util.DfCollectionUtil;
import org.dbflute.util.Srl;
import org.springframework.stereotype.Controller;
ense.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.dbflute.svflute.web.controller;

import java.util.List;

import org.dbflute.util.DfCollectionUtil;
import org.dbflute.util.Srl;
import org.springframework.stereotype.Controller;

/**
 * @author jflute
 */
public abstract class RootController {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final String CONTROLLER_SUFFIX = "Controller";
    protected static final UrlChain EMPTY_URL_CHAIN = new UrlChain(null);

    // ===================================================================================
    //                                                                            Redirect
    //                                                                            ========
    // #review URLの調整が必要 by jflute
    protected String redirect(Class<?> controllerType) {
        assertArgumentNotNull("controllerType", controllerType);
        return doRedirect(controllerType, EMPTY_URL_CHAIN);
    }

    protected String redirect(Class<?> controllerType, UrlChain moreUrl_or_params) {
        assertArgumentNotNull("controllerType", controllerType);
        assertArgumentNotNull("moreUrl_or_params", moreUrl_or_params);
        return doRedirect(controllerType, moreUrl_or_params);
    }

    protected String doRedirect(Class<?> controllerType, UrlChain chain) {
        Controller controllerAnno = controllerType.getAnnotation(Controller.class);
        if (controllerAnno == null) {
            String msg = "Not found the annotation of controller: " + controllerAnno;
            throw new IllegalArgumentException(msg);
        }
        String className = controllerType.getName();
        if (!className.endsWith(CONTROLLER_SUFFIX)) {
            String msg = "Not found the suffix of controller '" + CONTROLLER_SUFFIX + "': " + className;
            throw new IllegalArgumentException(msg);
        }
        String prefix = Srl.substringLastRear(Srl.substringLastFront(className, CONTROLLER_SUFFIX), ".", "$");
        String controllerPath = Srl.initUncap(prefix);
        StringBuilder sb = new StringBuilder();
        sb.append("redirect:/");
        sb.append(controllerPath);
        sb.append("/");
        final List<Object> getParamList = extractGetParamList(chain);
        buildUrlParts(sb, chain);
        buildGetParam(sb, controllerPath, getParamList);
        buildHashOnUrl(sb, chain);
        return sb.toString();
    }

    protected List<Object> extractGetParamList(UrlChain chain) {
        final Object[] paramsOnGet = chain != null ? chain.getParamsOnGet() : null;
        final List<Object> getParamList;
        if (paramsOnGet != null) {
            getParamList = DfCollectionUtil.newArrayList(paramsOnGet);
        } else {
            getParamList = DfCollectionUtil.emptyList();
        }
        return getParamList;
    }

    protected void buildUrlParts(StringBuilder sb, UrlChain chain) {
        final Object[] urlParts = chain != null ? chain.getUrlParts() : null;
        if (urlParts != null) {
            for (Object param : urlParts) {
                if (param != null) {
                    sb.append(param).append("/");
                }
            }
        }
    }

    protected void buildGetParam(StringBuilder sb, String actionPath, List<Object> getParamList) {
        int index = 0;
        for (Object param : getParamList) {
            if (index == 0) { // first loop
                sb.append("?");
            } else {
                if (index % 2 == 0) {
                    sb.append("&");
                } else if (index % 2 == 1) {
                    sb.append("=");
                } else { // no way
                    String msg = "no way: url=" + actionPath + " get-params=" + getParamList;
                    throw new IllegalStateException(msg);
                }
            }
            sb.append(param != null ? param : "");
            ++index;
        }
    }

    protected void buildHashOnUrl(StringBuilder sb, UrlChain chain) {
        final Object hash = chain != null ? chain.getHashOnUrl() : null;
        if (hash != null) {
            sb.append("#").append(hash);
        }
    }

    // -----------------------------------------------------
    //                                          Chain Method
    //                                          ------------
    /**
     * Set up more URL parts as URL chain. <br />
     * The name and specification of this method is synchronized with {@link UrlChain#moreUrl()}.
     * @param urlParts The varying array of URL parts. (NotNull)
     * @return The created instance of URL chain. (NotNull)
     */
    protected UrlChain moreUrl(Object... urlParts) {
        assertArgumentNotNull("urlParts", urlParts);
        return createUrlChain().moreUrl(urlParts);
    }

    /**
     * Set up parameters on GET as URL chain. <br />
     * The name and specification of this method is synchronized with {@link UrlChain#params()}.
     * @param paramsOnGet The varying array of parameters on GET. (NotNull)
     * @return The created instance of URL chain. (NotNull)
     */
    protected UrlChain params(Object... paramsOnGet) {
        assertArgumentNotNull("paramsOnGet", paramsOnGet);
        return createUrlChain().params(paramsOnGet);
    }

    /**
     * Set up hash on URL as URL chain. <br />
     * The name and specification of this method is synchronized with {@link UrlChain#hash()}.
     * @param hashOnUrl The value of hash on URL. (NotNull)
     * @return The created instance of URL chain. (NotNull)
     */
    public UrlChain hash(Object hashOnUrl) {
        assertArgumentNotNull("hashOnUrl", hashOnUrl);
        return createUrlChain().hash(hashOnUrl);
    }

    protected UrlChain createUrlChain() {
        return new UrlChain(this);
    }

    // ===================================================================================
    //                                                                         Render HTML
    //                                                                         ===========
    /**
     * Render HTML by the template.
     * <pre>
     * e.g. /sea/dockside/index.html
     *  return render(path_SeaDockside_IndexHtml);
     * </pre>
     * @param templatePath The object of template path. (NotNull)
     * @return The path for Spring MVC. (NotNull)
     */
    protected String render(HtmlTemplatePath templatePath) {
        assertArgumentNotNull("templatePath", templatePath);
        final String plainPath = templatePath.getPath();
        return Srl.substringLastFront(plainPath, ".html");
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    /**
     * Assert that the argument is not null.
     * @param argumentName The name of assert-target argument. (NotNull)
     * @param value The value of argument. (NotNull)
     * @throws IllegalArgumentException When the value is null.
     */
    protected void assertArgumentNotNull(String argumentName, Object value) {
        if (argumentName == null) {
            String msg = "The argument name should not be null: argName=null value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: argName=" + argumentName;
            throw new IllegalArgumentException(msg);
        }
    }
}
