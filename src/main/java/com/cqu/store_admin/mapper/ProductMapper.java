package com.cqu.store_admin.mapper;

import com.cqu.store_admin.entity.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductMapper {
    List<Product> findAllProduct();


//    private Integer id;
//    private Integer categoryId;
//    private String itemType;
//    private String title;
//    private String sellPoint;
//    private Long price;
//    private Integer num;
//    private String image;
//    private Integer status;
//    private Integer priority;

    Integer updateproducts(String id,
                           String itemType,
                           String title,
                           String sellPoint,
                           Long price,
                           Integer num,
                           String image,
                           Integer status,
                           Integer priority);
}
