package edu.sjtu.ist.rmp.sell.controller;

import edu.sjtu.ist.rmp.sell.VO.ProductVO;
import edu.sjtu.ist.rmp.sell.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wjh
 * @Date: 2018/12/11 0011 16:07
 * @Version 1.0
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @GetMapping("/list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        ProductVO productVO = new ProductVO();
        resultVO.setData(productVO);

        return resultVO;
    }
}
