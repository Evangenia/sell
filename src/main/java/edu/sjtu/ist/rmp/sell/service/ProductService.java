package edu.sjtu.ist.rmp.sell.service;

import edu.sjtu.ist.rmp.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2018/12/6 0006 20:18
 * @Version 1.0
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    /** 查询所有在架商品 */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
