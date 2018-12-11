package edu.sjtu.ist.rmp.sell.repository;

import edu.sjtu.ist.rmp.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2018/12/4 0004 16:52
 * @Version 1.0
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
