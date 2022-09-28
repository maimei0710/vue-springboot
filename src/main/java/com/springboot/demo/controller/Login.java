package com.springboot.demo.controller;

import com.springboot.demo.dao.DaoInterface;
import com.springboot.demo.entity.LoginForm;
import com.springboot.demo.entity.RegisterUser;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class Login {

    @Resource
    DaoInterface daoInterface;

//    跨域注解 CrossOrigin
    @PostMapping("login")
    public Object loginHome(
         @RequestBody LoginForm loginForm
    ){
//        System.out.println("前端的username   "+loginForm.getUsername());
//        System.out.println("前端的password   "+loginForm.getPassword());
        String username =null;
        String password =null;
//        System.out.println("------------------------");
//        System.out.println("前端  "+loginForm);

        if (loginForm.getUsername() !=null && !"".equals(loginForm.getUsername()) &&
                loginForm.getPassword() !=null && !"".equals(loginForm.getPassword())
        ){
            username =loginForm.getUsername();
            password =loginForm.getPassword();
        }
        List list = new ArrayList();
        LoginForm listloginForm = daoInterface.SelectUser(username,password);
//        System.out.println("数据库的username   "+listloginForm.getUsername());
//        System.out.println("数据库的password   "+listloginForm.getPassword());
        if (listloginForm != null){
            System.out.println("进入Home");
//            生成token
            String token = UUID.randomUUID()+"";
//            System.out.println(token);
            list.add(0,"200");
            list.add(1,token);
            return list;
        }else {
            System.out.println("err");
            list.add(0,404);
            return  list;
        }


    }
}

