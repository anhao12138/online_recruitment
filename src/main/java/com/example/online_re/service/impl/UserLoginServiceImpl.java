package com.example.online_re.service.impl;

import com.example.online_re.domain.UserLogin;
import com.example.online_re.mapper.UserLoginMapper;
import com.example.online_re.service.UserLoginService;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date 2021/3/11 16:13
 * @Version 1.0
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
     private UserLoginMapper userLoginMapper;

    /**
     * 登录
     *
     * @return
     */
    @Override
    public boolean userlogin(String name,String password) {
        UserLogin userLogin = userLoginMapper.checkName(name, password);
        if (userLogin.getName().equals("")||userLogin.getName()==null){
            System.out.println("登录失败");
            return false;
        }
        return true;
    }


    /**
     *注册
     * @param name
     * @param password
     * @param phone
     * @return
     */
    @Override
    public int addUser(String name, String password, String phone) {
        UserLogin user = new UserLogin(name,phone,password);
        int count =userLoginMapper.addUser(user);
        return count;
    }
    @Override
    public int reg(String name, String password, String phone) {
        return 0;
    }

    @Override
    public List<UserLogin> queryByUsername(String phone) {
        List<UserLogin> userList = userLoginMapper.queryByUsername(phone);
        return userList;
    }


}
