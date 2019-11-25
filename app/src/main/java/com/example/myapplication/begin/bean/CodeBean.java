package com.example.myapplication.begin.bean;

public class CodeBean {

    /**
     * status : success
     * code : 200
     * message : 发送成功
     */

    private String status;
    private int code;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
