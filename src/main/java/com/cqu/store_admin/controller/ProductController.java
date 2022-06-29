package com.cqu.store_admin.controller;

import com.cqu.store_admin.service.IProductService;
import com.cqu.store_admin.service.IUserService;
import com.cqu.store_admin.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {
    public static final int OK = 200;
    @Autowired
    private IProductService productService;

    @RequestMapping("show_products")
    public DataVO showUser()
    {
        return productService.findAllProduct();
    }

}
