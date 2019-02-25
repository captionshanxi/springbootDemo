package com.dansha.service.impl;

import com.dansha.dao.UserMapper;
import com.dansha.domain.User;
import com.dansha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dansha
 * @version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    //@Autowired
    //private UserDao userDao; //springdatajpa的实现
    
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public List<User> findAll(String username) {
        //return userDao.findAll();
        return userMapper.findUserByName(username);
    }
    
    @Override
    //整合redis-2标识当前方法使用缓存并存入redis
    // value:存入redis的key
    //key:用于指定方法执行返回值key 该属性是spring用的 不写也有默认返回值
    //只有多个方法重载时才用的到
    @Cacheable(value = "findAllCache",key = "'user.findAll'")
    public List<User> findUsers() {
        //测试redis
        System.out.println("执行去mysql数据库查询了");
        return userMapper.findUsers();
    }
}
