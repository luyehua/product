package com.imooc.product.VO;

import lombok.Data;

/**
 * @author: lu
 * @date: 2020-08-26 19:29
 **/
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
