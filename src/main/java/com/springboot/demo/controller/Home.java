package com.springboot.demo.controller;

import com.springboot.demo.dao.DaoInterface;
import com.springboot.demo.entity.HomeView;
import com.springboot.demo.exception.AppException;
import com.springboot.demo.exception.Yc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Home {

    @Resource
    DaoInterface daoInterface;

    @GetMapping("home")
    public List homePage(

    ){
        List<HomeView> homeView = daoInterface.SelectViewData();
//        for (int i = 0; i<homeView.size();i++){
//            System.out.print("id "+homeView.get(i).getId()+"   ");
//            System.out.print("value  "+homeView.get(i).getView());
//            System.out.println();
//        }
        List<HomeView> homeViewtwo = daoInterface.SelectViewDatatwo();
        homeView.get(0).setViewt(homeViewtwo.subList(0,4));
        homeView.get(1).setViewt(homeViewtwo.subList(4,6));
        homeView.get(2).setViewt(homeViewtwo.subList(6,8));
        for (int i = 0; i<homeViewtwo.size();i++){
            System.out.print("id "+homeViewtwo.get(i).getId()+"   ");
            System.out.print("value  "+homeViewtwo.get(i).getView());
            System.out.print("value  "+homeViewtwo.get(i).getPath());
            System.out.println();
        }
        System.out.println("-----------------");
        System.out.println();
      return homeView;
    }

}
