package com.cqu.store_admin.controller;

import com.cqu.store_admin.entity.User;
import com.cqu.store_admin.service.IUserService;
import com.cqu.store_admin.vo.DataVO;
import com.cqu.store_admin.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.cqu.store_admin.util.JsonResult;
@RestController
@RequestMapping("users")
public class UserController {
    public static final int OK = 200;
    @Autowired
    private IUserService userService;

    @RequestMapping("show_user")
    public DataVO showUser()
    {
       return userService.findAllUser();
    }

    @RequestMapping("update_user")
    public JsonResult<Void> updateUser(String email, String gender, String phone, Integer uid)
    {
       Integer row=  userService.updateUser(email,gender,phone,uid);
       return new JsonResult<Void>(OK);
    }
}
