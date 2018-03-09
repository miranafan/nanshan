// Copyright (C) 2018
// All rights reserved
package com.nanshan.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @author mirana
 * @version 1.0
 * @created 2018/2/24 上午11:43
 **/
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
//        pre：可以在请求被路由之前调用
//        routing：在路由请求时候被调用
//        post：在routing和error过滤器之后被调用
//        error：处理请求时发生错误时被调用
        return "pre";
    }

    @Override
    public int filterOrder() {
//        通过int值来定义过滤器的执行顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        Object accessToken = request.getParameter("accessToken");
        if (accessToken == null) {
            //令zuul过滤该请求，不对其进行路由
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        //ctx.setResponseBody("First Article Body");
        return null;
    }
}
