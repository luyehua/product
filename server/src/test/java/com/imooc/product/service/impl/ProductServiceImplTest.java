package com.imooc.product.service.impl;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

/**
 * @author: lu
 * @date: 2020-08-26 18:02
 **/
@Component
public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findList() {
        List<ProductInfo> list = productService.findList(Arrays.asList("157875196366160022", "157875227953464068"));
        assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() {
        DecreaseStockInput carDTO = new DecreaseStockInput("157875196366160022", 2);
        productService.decreaseStock(Arrays.asList(carDTO));
    }
}