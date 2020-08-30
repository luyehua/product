package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: lu
 * @date: 2020-08-26 17:41
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void testFindByProductStatus() {
        List<ProductInfo> productInfoList =  repository.findByProductStatus(0);
        Assert.assertTrue(productInfoList.size()>0);
    }

    @Test
    public void findByProductIdIn() {
        List<ProductInfo> productInfoList = repository.findByProductIdIn(Arrays.asList("157875196366160022", "157875227953464068"));
        assertTrue(productInfoList.size() > 0);
    }

}