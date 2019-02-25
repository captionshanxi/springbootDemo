package com.dansha.dao;

import com.dansha.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dansha
 * @version 1.0
 */
//可以让这个接口继承JpaRepository 第一泛型是实体类 第二个是主键的类型
//继承之后会自动生成findAll
@Repository("userDao")
public interface UserDao extends JpaRepository<User, Integer> {
}
