package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sell
 * @description:
 * @author: lu
 * @date: 2020-08-02 12:20
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say() {
        System.out.println(111111111);
        return "跟着廖师兄学习springboot";
    }
}
