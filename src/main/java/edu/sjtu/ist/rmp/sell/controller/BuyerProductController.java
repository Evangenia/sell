package edu.sjtu.ist.rmp.sell.controller;

import edu.sjtu.ist.rmp.sell.VO.ProductInfoVO;
import edu.sjtu.ist.rmp.sell.VO.ProductVO;
import edu.sjtu.ist.rmp.sell.VO.ResultVO;
import edu.sjtu.ist.rmp.sell.dataobject.ProductCategory;
import edu.sjtu.ist.rmp.sell.dataobject.ProductInfo;
import edu.sjtu.ist.rmp.sell.service.CategoryService;
import edu.sjtu.ist.rmp.sell.service.Impl.CategoryServiceImpl;
import edu.sjtu.ist.rmp.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: wjh
 * @Date: 2018/12/11 0011 16:07
 * @Version 1.0
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list(){
        //1. 查询所有上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2. 查询类目（一次性查询）
//        List<Integer> categoryTypeList = new ArrayList<>();
        //传统方法
//        for (ProductInfo productInfo : productInfoList){
////            categoryTypeList.add(productInfo.getCategoryType());
////        }
        //精简方法（java8,lambda）
        List<Integer> categoryTypeList = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        categoryService.findByCategoryTypeIn(categoryTypeList);


        //3. 数据拼装


        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();

        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        resultVO.setData(Arrays.asList(productVO));
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }
}
