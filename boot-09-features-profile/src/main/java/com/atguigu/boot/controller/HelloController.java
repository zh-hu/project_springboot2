package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghu
 * @create 2022-03-29 17:49
 */
@RestController
public class HelloController {

    @Value("${person.name:李四}")
    private String name;

    @Autowired
    private Person person;

    @Value("${os.name}")
    private String osName;

    @Value("${MAVEN_HOME}")
    private String msg;

    @GetMapping("/")
    public String hello(){

        return person.getClass().toString();
    }
    @GetMapping("/person")
    public Person person(){

        return person;
    }

    @GetMapping("/msg")
    public String getMsg(){
        return msg +"==>"+osName;
    }
}
