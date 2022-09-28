package com.springboot.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
* 实现 WebMvcConfigurer接口跨域
* */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    MyInterceptor myInterceptor;

    /*跨域请求*/
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("GET","POST","PUT","DELETE","HEAD","OPTIONS")
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*");
    }

    /*拦截器*/
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(myInterceptor)
                .addPathPatterns("/**") //添加需要拦截地址
                .excludePathPatterns("/**/login","/**/register") //添加不要拦截的路径
        ;
    }
}

