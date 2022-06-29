package com.cqu.store_admin.mapper;

import com.cqu.store_admin.entity.Product;
import com.cqu.store_admin.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ProductMapperTest {
    @Autowired
    private ProductMapper ProductMapper;

    @Test
    public void findAllProduct() {
        List<Product> productList=ProductMapper.findAllProduct();
        System.err.println(productList.get(0));
    }

}
