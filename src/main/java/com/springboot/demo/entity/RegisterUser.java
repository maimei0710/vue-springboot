package com.springboot.demo.entity;

import lombok.Data;

@Data
public class RegisterUser {
    private String StatusCode;
    private String username;
    private String password;
    private int age;
    private  String sex;

}
