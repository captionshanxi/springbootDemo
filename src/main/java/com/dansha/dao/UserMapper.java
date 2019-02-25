package com.dansha.dao;

import com.dansha.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Dansha
 * @version 1.0
 * 使用mybais实现对数据库操作接口
 *
 */
@Mapper//要求mybatis3.3以上
public interface UserMapper {
    
    @Select("select*from user where username like '%${value}%'")
    List<User> findUserByName(String username);
    
    @Select("select*from user")
    List<User> findUsers();
}
