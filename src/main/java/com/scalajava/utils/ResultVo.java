package com.scalajava.utils;

import java.io.Serializable;

/**
 * http请求返回对象
 * */
public class ResultVo<T> implements Serializable {
    /**错误码*/
    private Integer code;

    /**提示信息*/
    private String msg;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**具体类容*/
    private T data;
}
