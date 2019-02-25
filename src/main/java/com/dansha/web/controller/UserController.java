package com.dansha.web.controller;

import com.dansha.domain.User;
import com.dansha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Dansha
 * @version 1.0
 * 用户控制
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    //restful风格 指定页面传来的参数是哪个值
    @RequestMapping("/findAll/{username}")
    public List<User> findAll(@PathVariable("username") String username){
        List<User> users = userService.findAll(username);
        return users;
    }
    
    //springboot整合redis
    @RequestMapping("/findUsers")
    public List<User> findUsers(){
        List<User> users = userService.findUsers();
        return users;
    }
}
