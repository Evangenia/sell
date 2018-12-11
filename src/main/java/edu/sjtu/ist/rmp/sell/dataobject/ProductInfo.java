package edu.sjtu.ist.rmp.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * @Author: wjh
 * @Date: 2018/12/6 0006 10:20
 * @Version 1.0
 */
@Entity
@Data
public class ProductInfo {

    /** 商品id. */
    @Id
    private String productId;

    /** 商品名称. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private  Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 商品状态,0正常1下架. */
    private Integer productStatus;

    /** 类目编号. */
    private Integer categoryType;

}
