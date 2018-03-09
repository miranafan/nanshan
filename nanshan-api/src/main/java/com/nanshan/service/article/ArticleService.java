// Copyright (C) 2018 Nanshan
// All rights reserved
package com.nanshan.service.article;

import exception.NSException;
import exception.ServiceException;
import model.AjaxResult;
import org.springframework.stereotype.Component;

/**
 * @author mirana
 * @version 1.0
 * @created 2018/3/8 下午4:31
 **/

@Component
public class ArticleService {

    public String getArticle(String id) throws ServiceException {

        //throw NSException.paramException("测试异常拦截器!");

        return AjaxResult.success("12233").toJsonString();
    }
}
