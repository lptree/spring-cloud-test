package com.lptree.servicefeign.controller;

import com.lptree.servicefeign.externalservices.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: lptree
 * @Date: Created in 2018/4/18 21:40
 */
@RestController
public class HelloController {

    @Autowired
    IHelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }
}
