package com.imooc.product.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: lu
 * @date: 2020-08-28 09:58
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecreaseStockInput {

    /**
     * id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

}
