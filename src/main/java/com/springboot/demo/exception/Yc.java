package com.springboot.demo.exception;

public enum Yc {

    USERNAME_NOT_EXISTS(10001,"用户名不存在"),
    USER_CREDIT_NOT_ENOUTH(10002,"用户积分不足"),
    DataException(11001,"参数异常");



    private int code ;   //状态码
    private String msg ;   //信息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    Yc(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
