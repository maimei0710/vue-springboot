package com.springboot.demo.controller;

import com.springboot.demo.util.RedisUtil;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
public class Register {

    @Resource
    RedisUtil redisUtil;


    @RequestMapping("register")
    public List<String> registerPage(){
        List<String> list =new ArrayList<>();
        list.add("A");

        String b = redisUtil.get("J");
        list.add(b);
        return list;

    }
}
