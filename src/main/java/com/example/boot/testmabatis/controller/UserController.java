package com.example.boot.testmabatis.controller;

import com.example.boot.testmabatis.dao.User;
import com.example.boot.testmabatis.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Map;

@Controller

public class UserController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/user")
    public User findUser(@RequestParam(value="id") Long id ){
        return userMapper.findById(id);
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }


    @RequestMapping("/dologin")
    public String dologin(User user, Map<String, String> map){
        User user1 = userMapper.selectUser(user.getFirstname(),user.getPasswd());
        System.out.println(user1.getFirstname());
        System.out.println(user1.getPasswd());
        if(user1 == null){
            map.put("msg","密码或账号错误!");
            return "fail";
        }
        else {
            map.put("msg","登陆成功");
            return "success";
        }
    }

    @RequestMapping("/doregist")
    public String doregist(User user, Map<String, String> map){
        userMapper.inserUser(user.getFirstname(), user.getPasswd());
        map.put("msg","注册成功");
        return "success";
    }
}
