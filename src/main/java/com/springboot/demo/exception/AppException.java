package com.springboot.demo.exception;

public class AppException extends RuntimeException{

    private int code = 500;
    private String msg = "服务器异常";


    public AppException(Yc yc){
        super();
        this.code = yc.getCode();
        this.msg = yc.getMsg();

    }

    public AppException(int code, String msg){
        super();
        this.code = code;
        this.msg = msg;

    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}