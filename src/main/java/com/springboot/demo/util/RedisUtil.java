package com.springboot.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    public String get(String key){

        return redisTemplate.opsForValue().get(key);
    }
}
