// Copyright (C) 2018 Nanshan
// All rights reserved
package exception;

import exception.Enums.ErrorCode;

/**
 * @author mirana
 * @version 1.0
 * @created 2018/3/8 下午4:08
 **/
public class NSException {

    public static ServiceException paramException(String message) {
        return build(ErrorCode.PARAM_EXCEPTION, message);
    }

    public static ServiceException queryException(String message) {
        return build(ErrorCode.QUERY_EXCEPTION, message);
    }

    public static ServiceException persistException(String message) {
        return build(ErrorCode.PERSIST_EXCEPTION, message);
    }

    public static ServiceException remoteInvokeException(String message) {
        return build(ErrorCode.REMOTE_INVOKE_EXCEPTION,  message);
    }

    public static ServiceException remoteInvokeResultException(String message) {
        return build(ErrorCode.REMOTE_INVOKE_RESULT_EXCEPTION,  message);
    }

    private static ServiceException build(ErrorCode errorCode, String message) {
        return new ServiceException(errorCode, message);
    }
}
