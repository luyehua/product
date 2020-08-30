package com.imooc.product.service;

import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author: lu
 * @date: 2020-08-26 17:54
 **/
public interface ProductService {

    /**
     * 查下所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
