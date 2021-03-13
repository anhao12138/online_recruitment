package com.example.online_re.domain;

/**
 * @Date 2021/3/11 19:18
 * @Version 1.0
 */

public class Response {
    String msg;
    int code;
    Boolean isSuc = true;

    public Response(){}

    public Response(String msg, int code, Boolean isSuc) {
        this.msg = msg;
        this.code = code;
        this.isSuc = isSuc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Boolean getSuc() {
        return isSuc;
    }

    public void setSuc(Boolean suc) {
        isSuc = suc;
    }
}
