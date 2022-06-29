package com.cqu.store_admin.vo;

import com.cqu.store_admin.entity.BaseEntity;
import lombok.Data;

@Data
public class UserVO extends BaseEntity {
    private Integer uid;
    private String username;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private Integer gender;
    private String avatar;
    private Integer isDelete;
}
