package query;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * 统一返回结果
 *
 * @author tangpan
 * @date 2020-10-22 13:37
 */
public class ResultQuery implements Serializable {

    /** 序列 */
    private static final long serialVersionUID = 1L;
    /** 编码 */
    private int code;
    /** 描述 */
    private String msg;
    /** 返回对象 */
    private JSONObject data;

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

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }
}
