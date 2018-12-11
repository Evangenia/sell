package edu.sjtu.ist.rmp.sell.service;

import edu.sjtu.ist.rmp.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2018/12/5 0005 19:25
 * @Version 1.0
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
