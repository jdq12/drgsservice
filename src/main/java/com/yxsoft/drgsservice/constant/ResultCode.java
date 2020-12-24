package com.yxsoft.drgsservice.constant;

public enum ResultCode {

    SUCCESS(200,"操作成功"),
    FAIL(400,"操作失败"),
   // PARAM_INVAILD(400,"提交参数非法"),
    NOT_AUTHED(404,"接口不存在"),
    INTERNAL_SERVER_ERROR(500,"服务器错误");

    private Integer code;
    private String msg;


    private ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }


}