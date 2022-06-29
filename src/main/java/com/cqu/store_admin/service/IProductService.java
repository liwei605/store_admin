package com.cqu.store_admin.service;

import com.cqu.store_admin.vo.DataVO;
import com.cqu.store_admin.vo.ProductVO;
import com.cqu.store_admin.vo.UserVO;

public interface IProductService {
    DataVO<ProductVO> findAllProduct();
    Integer updateProducts(String id,
                           String itemType,
                           String title,
                           String sellPoint,
                           Long price,
                           Integer num,
                           String image,
                           Integer status,
                           Integer priority);
}
