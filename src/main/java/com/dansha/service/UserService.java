package com.dansha.service;

import com.dansha.domain.User;

import java.util.List;

/**
 * @author Dansha
 * @version 1.0
 * 用户业务层接口
 */
public interface UserService {
    
    List<User> findAll(String username);
    
    List<User> findUsers();
}
