package com.example.online_re.service;

import com.example.online_re.domain.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @Date 2021/3/11 13:33
 * @Version 1.0
 */
@Repository
public interface UserLoginService {

    /**
     * 登录
     * @return
     */
     boolean userlogin(String name,String password);

    int addUser(String username,String password,String phone);

    /**
     * 注册
     * @param name
     * @param password
     * @param phone
     * @return
     */
    int reg(String name, String password, String phone);

    List<UserLogin> queryByUsername(String phone);



}
