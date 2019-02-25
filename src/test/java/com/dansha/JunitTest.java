package com.dansha;

import com.dansha.domain.User;
import com.dansha.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Dansha
 * @version 1.0
 * springboot整合junit
 */
@RunWith(SpringJUnit4ClassRunner.class)//用springboot的方式测试 相当于把类放到ioc
@SpringBootTest(classes = Application.class)//指定引导类
public class JunitTest {
    @Autowired
    private UserService userService;
    
    @Test
    public void testFindAll() throws Exception{
        List<User> userList = userService.findUsers();
        //运行测试能看见打印就成功
        System.out.println(userList);
    }
    
    //读取配置文件中的数据
    @Autowired
    private Environment env;
    @Test
    public void testSpringConfig() throws Exception{
        System.out.println(env.getProperty("spring.jpa.database"));
    
    }
}
