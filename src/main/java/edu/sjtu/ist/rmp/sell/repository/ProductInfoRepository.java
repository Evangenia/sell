package edu.sjtu.ist.rmp.sell.repository;

import edu.sjtu.ist.rmp.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2018/12/6 0006 13:57
 * @Version 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
