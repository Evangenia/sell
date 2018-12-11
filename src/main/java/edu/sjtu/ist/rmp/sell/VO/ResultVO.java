package edu.sjtu.ist.rmp.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @Author: wjh
 * @Date: 2018/12/11 0011 16:32
 * @Version 1.0
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /*** 具体内容. */
    private T data;

}
