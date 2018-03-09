package model.status;

public enum OnOffEnum {
    ON(1, "启用"),
    OFF(2, "停用")
    ;

    private int code;
    private String value;

    OnOffEnum(int code, String value) {
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
