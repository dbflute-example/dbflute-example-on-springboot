/*
 * Copyright 2014-2018 the original author or authors.
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
package org.docksidestage.bizfw;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dbflute.hook.AccessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jflute
 * @author y.shimizu
 */
public class GodHandableInterceptor implements AsyncHandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(GodHandableInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
            if (logger.isDebugEnabled()) {
                logger.debug("#flow ...Beginning #controller " + buildActionDisp(handlerMethod));
            }
        }
        prepareAccessContext();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
        if (handler instanceof HandlerMethod) {
            if (logger.isDebugEnabled()) {
                logger.debug("modelAndView: {}", modelAndView != null ? modelAndView.toString() : null);
                final HandlerMethod handlerMethod = (HandlerMethod) handler;
                logger.debug("#flow ...Calling back #finally for " + buildActionDisp(handlerMethod));
            }
        }
    }

    protected String buildActionDisp(HandlerMethod handlerMethod) {
        final Method method = handlerMethod.getMethod();
        final Class<?> declaringClass = method.getDeclaringClass();
        return declaringClass.getSimpleName() + "." + method.getName() + "()";
    }

    protected void prepareAccessContext() {
        AccessContext context = new AccessContext();
        context.setAccessLocalDateTime(LocalDateTime.now());
        context.setAccessUser("example user");
        AccessContext.setAccessContextOnThread(context);
    }
}
