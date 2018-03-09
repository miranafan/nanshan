// Copyright (C) 2018 Nanshan
// All rights reserved
package model;

import com.alibaba.fastjson.JSON;
import exception.Enums.ErrorCode;

/**
 * @author mirana
 * @version 1.0
 * created 2018/3/5 上午11:28
 **/
public class AjaxResult<T> {
    private final static String SUCCESS_CODE = "200";

    /**
     * 返回码
     */
    private String code;

    /**
     * 错误信息-code为异常状态时展示
     */
    private String message;

    /**
     * 返回内容
     */
    private T data;

    /**
     * 应用名，默认为NS
     */
    private String domain = "NS-API";

    private AjaxResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public AjaxResult(String code, T data, String message) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private AjaxResult(String code, T data, String message, String domain) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.domain = domain;
    }

    /**
     * 请求异常
     *
     * @param errorCode ErrorCode
     * @return AjaxResult
     */
    public static AjaxResult failure(ErrorCode errorCode) {
        return new AjaxResult(errorCode.getCode(), errorCode.getDesc());
    }

    /**
     * 请求成功
     *
     * @param data data
     * @return AjaxResult
     */
    public static <T> AjaxResult success(T data) {
        return new AjaxResult(SUCCESS_CODE, data, "");
    }

    /**
     * 转换成json字符串
     *
     * @return String
     */
    public String toJsonString() {
        return JSON.toJSONString(this);
    }


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public String getDomain() {
        return domain;
    }
}
