package enums;

/**
 * 请求响应枚举对象
 *
 * @author tangpan
 * @date 2020-10-22 15:06
 */
public enum RequestEnum {
    SUCCESS(0,"成功"),
    FAIL(1,"失败"),
    EXCEPTION(404,"异常"),
    ERROR(2,"错误")
    ;
    /** 编码 */
    private int code;
    /** 描述 */
    private String msg;

    RequestEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
