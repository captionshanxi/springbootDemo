package com.dansha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author Dansha
 * @version 1.0
 * springboot引导类
 */
@SpringBootApplication
//整合redis-1.开启springboot对缓存的支持
@EnableCaching
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
