package com.nanshan.controller.article;


import ch.qos.logback.classic.Logger;
import com.nanshan.service.article.ArticleService;
import exception.ServiceException;
import model.AjaxResult;
import exception.Enums.ErrorCode;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mirana
 * @version 1.0
 * @created 2018/2/22 下午2:36
 **/

@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {
    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Resource
    private ArticleService articleService;

    @CrossOrigin
    @RequestMapping(value = "/get/{seriesId}", method = RequestMethod.GET)
    public String getArticle(@PathVariable String seriesId) throws ServiceException {

        //articleService.getArticle(seriesId);
        Map map = new HashMap();
        map.put("aa","bb");
        return AjaxResult.success(map).toJsonString();

    }
}
