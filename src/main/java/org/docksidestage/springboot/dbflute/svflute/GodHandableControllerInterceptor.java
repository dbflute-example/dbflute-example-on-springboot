/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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
package org.docksidestage.springboot.dbflute.svflute;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author jflute
 */
public class GodHandableControllerInterceptor extends HandlerInterceptorAdapter {

    private static final Log LOG = LogFactory.getLog(GodHandableControllerInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        final HandlerMethod handlerMethod = (HandlerMethod) handler;
        if (LOG.isDebugEnabled()) {
            LOG.debug("#flow ...Beginning #controller " + buildActionDisp(handlerMethod));
        }
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        if (LOG.isDebugEnabled()) {
            LOG.debug(modelAndView);
            //final HandlerMethod handlerMethod = (HandlerMethod) handler;
            // TODO jflute example: SpringBoot, finally logging;
            //final String failureMark = "";
            //LOG.debug("#flow ...Calling back #finally" + failureMark + " for " + buildActionName(handlerMethod));
        }
    }

    protected String buildActionDisp(HandlerMethod handlerMethod) {
        final Method method = handlerMethod.getMethod();
        final Class<?> declaringClass = method.getDeclaringClass();
        return declaringClass.getSimpleName() + "." + method.getName() + "()";
    }

    protected String buildActionName(HandlerMethod handlerMethod) {
        final Method method = handlerMethod.getMethod();
        final Class<?> declaringClass = method.getDeclaringClass();
        return declaringClass.getSimpleName();
    }
}
