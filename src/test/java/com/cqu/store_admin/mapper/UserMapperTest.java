package com.cqu.store_admin.mapper;

import com.cqu.store_admin.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAllUser() {
        List<User>  userList=userMapper.findAllUser();
        System.err.println(userList);
    }

    @Test
    public void getUserNum() {
        Integer num= userMapper.findAllUser().size();
        System.err.println(num);
    }

    @Test
    public void updateUser() {
        Integer num= userMapper.updateUser("2499280864@qq.com","1","123123123123",11);
        System.err.println(num);

    }
}
