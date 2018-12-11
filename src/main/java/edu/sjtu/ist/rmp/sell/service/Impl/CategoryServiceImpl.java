package edu.sjtu.ist.rmp.sell.service.Impl;

import edu.sjtu.ist.rmp.sell.dataobject.ProductCategory;
import edu.sjtu.ist.rmp.sell.repository.ProductCategoryRepository;
import edu.sjtu.ist.rmp.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2018/12/5 0005 19:33
 * @Version 1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        List<ProductCategory> productCategoryList = repository.findAll();
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
