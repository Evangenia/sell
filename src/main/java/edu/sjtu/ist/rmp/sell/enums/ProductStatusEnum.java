package edu.sjtu.ist.rmp.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * @Author: wjh
 * @Date: 2018/12/6 0006 21:13
 * @Version 1.0
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
