package com.cqu.store_admin.mapper;

import com.cqu.store_admin.entity.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductMapper {
    List<Product> findAllProduct();

}
