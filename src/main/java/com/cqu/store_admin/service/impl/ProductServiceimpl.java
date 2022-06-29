package com.cqu.store_admin.service.impl;

import com.cqu.store_admin.entity.Product;
import com.cqu.store_admin.entity.User;
import com.cqu.store_admin.mapper.ProductMapper;
import com.cqu.store_admin.mapper.UserMapper;
import com.cqu.store_admin.service.IProductService;
import com.cqu.store_admin.vo.DataVO;
import com.cqu.store_admin.vo.ProductVO;
import com.cqu.store_admin.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceimpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;
    @Override
    public DataVO<ProductVO> findAllProduct() {
        List<Product> productList= productMapper.findAllProduct();
        DataVO<ProductVO> dataVO =new DataVO<>();
        dataVO.setCount(productList.size());
        dataVO.setMsg("");
        dataVO.setCode(0);

        List<ProductVO> productVOList =new ArrayList<>();
        for (Product product : productList)
        {
            ProductVO productVO =new ProductVO();
            BeanUtils.copyProperties(product,productVO);
            productVOList.add(productVO);
        }

        dataVO.setData(productVOList);
        return  dataVO;
    }

//    <!--    Integer updateproducts(Integer id,-->
//            <!--    String itemType,-->
//                                           <!--    String title,-->
//                                           <!--    String sellPoint,-->
//                                           <!--    Long price,-->
//                                           <!--    Integer num,-->
//                                           <!--    String image,-->
//                                           <!--    Integer status,-->
//                                           <!--    Integer priority);-->
    @Override
    public Integer updateProducts(String id,
                                  String itemType,
                                  String title,
                                  String sellPoint,
                                  Long price,
                                  Integer num,
                                  String image,
                                  Integer status,
                                  Integer priority) {
        Integer row=productMapper.updateproducts(id,itemType,title,sellPoint,price,num,image,status,priority);
        return row;

    }


}
