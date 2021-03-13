package com.example.online_re.controller;

import com.example.online_re.domain.Response;
import com.example.online_re.domain.UserLogin;
import com.example.online_re.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @Date 2021/3/11 20:08
 * @Version 1.0
 */

@RestController
public class LoginController {
    @Autowired
    private UserLoginService service;
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Response register(@RequestBody Map<String,String> person){
        String name =person.get("name");
        String password = person.get("password");
        String phone = person.get("phone");
        //判断账号密码是否为空
        if (name!=null&&password!=null&&phone!=null){
            List<UserLogin> users = service.queryByUsername(phone);
            if (users!=null&&users.size()>0){
                return new Response("注册失败,电话号码已被注册",-1,true);
            }else {
            int count = service.addUser(name,phone,password);
            if (count>0){
                return new Response("注册成功",1,true);
            }else {
                return new Response("注册失败",-1,true);
            }
            }
        }else {

            return new Response("注册失败，请检查用户名、密码、手机号是否为空", -1, true);
        }
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Response login(@RequestBody Map<String ,String> person){
        String phone = person.get("phone");
        String password = person.get("password");
        //判断用户名是否存在
        if (phone!=null&&password!=null){
                List<UserLogin> users = service.queryByUsername(phone);
                if (users!=null&&users.size()>0){
                    UserLogin userLogin = users.get(0);
                    if (password .equals(userLogin.getPassword())){
                        return new Response("登录成功",1,true);
                    }else {
                        return new Response("登录失败，密码错误",-1,false);
                    }
                }else {
                    return new Response("登录失败，电话不存在",-1,false);
                }

            }else {
                return new Response("登录失败，请检查账号密码",-1,false);
            }

    }
}
