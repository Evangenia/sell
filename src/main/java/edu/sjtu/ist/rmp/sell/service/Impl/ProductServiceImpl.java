package edu.sjtu.ist.rmp.sell.service.Impl;

import edu.sjtu.ist.rmp.sell.dataobject.ProductInfo;
import edu.sjtu.ist.rmp.sell.enums.ProductStatusEnum;
import edu.sjtu.ist.rmp.sell.repository.ProductInfoRepository;
import edu.sjtu.ist.rmp.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wjh
 * @Date: 2018/12/6 0006 20:44
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(ProductStatusEnum.UP.getCode());
        return productInfoList;
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
