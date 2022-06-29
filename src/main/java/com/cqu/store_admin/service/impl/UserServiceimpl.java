package com.cqu.store_admin.service.impl;

import com.cqu.store_admin.entity.User;
import com.cqu.store_admin.mapper.UserMapper;
import com.cqu.store_admin.service.IUserService;
import com.cqu.store_admin.vo.DataVO;
import com.cqu.store_admin.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceimpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public DataVO<UserVO> findAllUser() {
        List<User> userList= userMapper.findAllUser();
        DataVO<UserVO> dataVO =new DataVO<>();
        dataVO.setCount(userList.size());
        dataVO.setMsg("");
        dataVO.setCode(0);

        List<UserVO> userVOList =new ArrayList<>();
        for (User user : userList)
        {
            UserVO userVO =new UserVO();
            BeanUtils.copyProperties(user,userVO);
            userVOList.add(userVO);
        }

        dataVO.setData(userVOList);
       return  dataVO;
    }

    @Override
    public Integer updateUser(String email, String gender, String phone, Integer uid) {
        Integer row=  userMapper.updateUser(email,gender,phone,uid);
        return row;
    }

}
