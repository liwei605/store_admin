package com.cqu.store_admin.service;

import com.cqu.store_admin.entity.User;
import com.cqu.store_admin.vo.DataVO;
import com.cqu.store_admin.vo.UserVO;

import java.util.List;

public interface IUserService {

    DataVO<UserVO> findAllUser();

    Integer updateUser(String email,String gender,String phone,Integer uid);
}
