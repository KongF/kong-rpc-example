package com.kong;

import java.io.Serializable;

public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = 5446115418395098891L;
    private Integer code;
    private String message;
    private T data;

    public static <T> CommonResult<T> success(T object) {
        CommonResult<T> CommonResult = new CommonResult<>();
        CommonResult.setCode(ResultCode.SUCCESS.getCode());
        CommonResult.setMessage(ResultCode.SUCCESS.getDesc());
        CommonResult.setData(object);
        return CommonResult;
    }

    public static <T> CommonResult<T> error(ResultCode resultCode) {
        CommonResult<T> CommonResult = new CommonResult<>();
        CommonResult.setCode(resultCode.getCode());
        CommonResult.setMessage(resultCode.getDesc());
        return CommonResult;
    }

    public static <T> CommonResult<T> error(ResultCode resultCode, String message) {
        CommonResult<T> CommonResult = new CommonResult<>();
        CommonResult.setCode(resultCode.getCode());
        CommonResult.setMessage(message);
        return CommonResult;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
