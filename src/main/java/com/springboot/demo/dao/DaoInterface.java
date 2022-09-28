package com.springboot.demo.dao;

import com.springboot.demo.entity.HomeView;
import com.springboot.demo.entity.LoginForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DaoInterface {
    @Select(
            "SELECT " +
                    "username,password\n" +
                    "FROM " +
                    "rgzn_student \n" +
                    "WHERE username=#{username} AND `password`=#{password}\n" +
                    "UNION\n" +
                    "SELECT \n" +
                    "username,password\n" +
                    "FROM \n" +
                    "dzjx_student\n" +
                    "WHERE username=#{username} AND `password`=#{password}\n" +
                    "UNION\n" +
                    "SELECT \n" +
                    "username,password\n" +
                    "FROM \n" +
                    "jjgl_student\n" +
                    "WHERE username=#{username} AND `password`=#{password}\n"
    )
    LoginForm SelectUser(String username,String password);

    @Select(
            "SELECT * FROM view_data"
    )
    List<HomeView> SelectViewData();

    @Select(
            "SELECT * FROM view_data_two"
    )
    List<HomeView> SelectViewDatatwo();
}
