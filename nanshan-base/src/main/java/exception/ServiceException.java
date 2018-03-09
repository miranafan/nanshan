// Copyright (C) 2018 Nanshan
// All rights reserved
package exception;

import exception.Enums.ErrorCode;

/**
 * @author mirana
 * @version 1.0
 * @created 2018/3/8 下午3:30
 **/
public class ServiceException extends Exception {
    /**
     * 错误码
     */
    private ErrorCode code;

    /**
     * 错误信息
     */
    private String message;

    public ServiceException(ErrorCode code, String message) {
        this.code = code;
        this.message = message;
    }

    public ErrorCode getCode() {
        return code;
    }

    public void setCode(ErrorCode code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
