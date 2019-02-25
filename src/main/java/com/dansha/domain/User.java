package com.dansha.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Dansha
 * @version 1.0
 */
//声明实体类jpa版本
@Entity
//声明数据库中的表名
@Table(name = "user")
public class User implements Serializable {
    @Id
    @Column(name = "id")//在数据库中对应的列名
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id自增
    private Integer id;
    
    @Column(name="username")
    private String username;
    
    @Column(name="password")
    private String password;
    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
