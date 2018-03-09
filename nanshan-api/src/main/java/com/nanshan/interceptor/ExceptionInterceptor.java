// Copyright (C) 2018 Nanshan
// All rights reserved
package com.nanshan.interceptor;

import model.AjaxResult;
import exception.Enums.ErrorCode;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author mirana
 * @version 1.0
 * @created 2018/3/5 上午10:59
 **/

@Component
public class ExceptionInterceptor implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();

        try (PrintWriter writer = httpServletResponse.getWriter()) {
            AjaxResult ajaxResult = new AjaxResult<>(ErrorCode.INTERNAL_EXCEPTION.getCode(),ErrorCode.INTERNAL_EXCEPTION.getDesc(),e.getMessage());

            httpServletResponse.setHeader("Content-type", "application/json;charset=UTF-8");
            writer.write(ajaxResult.toJsonString());
            writer.flush();
        } catch (IOException ex) {
            //LOGGER.error("ExceptionResolver io exception.", e);
        }

        modelAndView.clear();
        return modelAndView;
    }
}
