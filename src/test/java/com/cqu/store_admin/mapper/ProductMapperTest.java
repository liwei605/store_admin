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

//    Integer updateproducts(Integer id,
//                           String itemType,
//                           String title,
//                           String sellPoint,
//                           Long price,
//                           Integer num,
//                           String image,
//                           Integer status,
//                           Integer priority);
    @Test
    public void updateAllProduct() {
        String id="10000001";
        String itemType="牛皮纸记事本";
        String title="广博(GuangBo)10本装40张A5牛皮纸记事本子日记本办公软抄本GBR0731";
        String sellPoint="这个本子超级好悠悠！";
        Long price=14L;
        Integer num=1;
        String image="/images/portal/00GuangBo1040A5GBR0731/";
        Integer status=1;
        Integer priority=62;
        Integer row= ProductMapper.updateproducts(id,itemType,title,sellPoint,price,num,image,status,priority);
        System.err.println(row);
    }

}
