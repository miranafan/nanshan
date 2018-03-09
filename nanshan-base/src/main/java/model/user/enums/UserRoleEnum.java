package model.user.enums;

public enum UserRoleEnum {
    VISITOR(1, "游客"),
    VIP(2, "会员")
    ;

    private int code;
    private String value;

    UserRoleEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
