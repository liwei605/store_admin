package com.cqu.store_admin.vo;

import com.cqu.store_admin.entity.BaseEntity;
import lombok.Data;

@Data
public class ProductVO extends BaseEntity {
    private Integer id;
    private Integer categoryId;
    private String itemType;
    private String title;
    private String sellPoint;
    private Long price;
    private Integer num;
    private String image;
    private Integer status;
    private Integer priority;
}
