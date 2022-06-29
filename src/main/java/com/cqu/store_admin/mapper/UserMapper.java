package com.cqu.store_admin.mapper;

import com.cqu.store_admin.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

/**
 * �����û����ݲ����ĳ־ò�ӿ�
 */
public interface UserMapper {

    //ֱ�Ӳ�ѯ���е��û�
    List<User> findAllUser();

    //��ȡ�û�����
    Integer getuserCount();

    //�����û���Ϣ
    Integer updateUser(String email,String gender,String phone,Integer uid);
 }
