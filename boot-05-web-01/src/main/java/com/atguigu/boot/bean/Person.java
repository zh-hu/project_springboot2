package com.atguigu.boot.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author zhanghu
 * @create 2022-03-26 14:40
 */
@Data
public class Person {

    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;
}
