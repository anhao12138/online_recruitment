package com.example.online_re.mapper;

import com.example.online_re.domain.UserLogin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserLoginMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
    @Select("select * from user_login where name=#{name} and password=#{password}")
    UserLogin checkName(String name, String password);

    @Select("SELECT * FROM user_login WHERE phone = #{phone}")
    List<UserLogin> queryByUsername(String phone);

    @Insert("INSERT INTO user_login(name,password,phone)  VALUES(#{name},#{password},#{phone})")
    int addUser(String name, String phone,String password);


    int addUser(UserLogin user);
}