package com.cqu.store_admin.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    public void findAllUser() {
        System.err.println(userService.findAllUser());
    }

    @Test
    public void updateUser(){
        System.err.println(userService.updateUser("1231@qq.com","0","123",11));
    }
}
