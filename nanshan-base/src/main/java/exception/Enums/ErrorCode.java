package exception.Enums;

public enum ErrorCode {
    /**
     * ErrorCode枚举: code,desc
     */
    INTERNAL_EXCEPTION("000", "系统异常"),

    PARAM_EXCEPTION("002", "参数异常"),

    QUERY_EXCEPTION("003", "数据查询异常"),

    PERSIST_EXCEPTION("004", "数据持久化异常"),

    REMOTE_INVOKE_EXCEPTION("005", "远程调用异常"),

    REMOTE_INVOKE_RESULT_EXCEPTION("006", "远程调用返回结果异常");

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误描述
     */
    private String desc;

    ErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
