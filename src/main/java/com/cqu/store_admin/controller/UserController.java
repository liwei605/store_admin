package com.cqu.store_admin.controller;

import com.cqu.store_admin.entity.User;
import com.cqu.store_admin.service.IUserService;
import com.cqu.store_admin.vo.DataVO;
import com.cqu.store_admin.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("show_user")
    public DataVO showUser()
    {
       return userService.findAllUser();
    }
}
