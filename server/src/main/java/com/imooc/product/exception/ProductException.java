package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * @author: lu
 * @date: 2020-08-27 16:41
 **/
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
