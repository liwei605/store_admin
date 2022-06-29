package com.cqu.store_admin.mapper;

import com.cqu.store_admin.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

/**
 * 处理用户数据操作的持久层接口
 */
public interface UserMapper {

    //直接查询所有的用户
    List<User> findAllUser();

    //获取用户数量
    Integer getuserCount();

    //更新用户信息
    Integer updateUser(String email,String gender,String phone,Integer uid);
 }
