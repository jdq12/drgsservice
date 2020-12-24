package com.yxsoft.drgsservice.system;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yxsoft.drgsservice.constant.ResultCode;

import java.io.Serializable;

public class Result implements Serializable {
    int code=0;
    String message="success";
    Object data=null;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.getCode();
        return this;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }
}
