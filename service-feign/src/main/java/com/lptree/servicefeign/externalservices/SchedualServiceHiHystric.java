package com.lptree.servicefeign.externalservices;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: lptree
 * @Date: Created in 2018/5/6 11:56
 */
@Component
public class SchedualServiceHiHystric implements IHelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
