package com.atguigu.hello.service;

import com.atguigu.hello.bean.HelloPoperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhanghu
 * @create 2022-03-30 13:14
 */
//默认不在放在容器中
public class HelloService {

    @Autowired
    HelloPoperties helloPoperties;

    public String sayHello(String userName){
        return helloPoperties.getPerfix()+":"+userName+">"+helloPoperties.getSuffix();
    }
}
