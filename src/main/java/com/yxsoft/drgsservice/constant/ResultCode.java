package com.yxsoft.drgsservice.constant;

public enum ResultCode {
     SUCCESS(200),
    FAIL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);
    private int code;
    private ResultCode(int code) {
        this.code = code;
    }

    public final int getCode() {
        return this.code;
    }

    public final void setCode(int code) {
        this.code = code;
    }


}