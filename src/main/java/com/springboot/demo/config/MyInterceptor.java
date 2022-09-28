package com.springboot.demo.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Component
public class MyInterceptor implements HandlerInterceptor {

    @Override
    /*在conteroller层之前执行*/
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String resUrl = request.getRequestURL().toString();
//        if(resUrl.contains("springboot")){
//            System.out.println(new Date() +"rew" +resUrl);
//            return true;
//        }else{
//            System.out.println("请求非法");
//            return false;
//        }

        return true;
    }
    @Override
    /*在conteroller层之后执行*/
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }
    @Override
    /*在整个页面加载完成后执行*/
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
