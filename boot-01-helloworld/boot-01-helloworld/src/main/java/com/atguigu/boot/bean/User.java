package com.atguigu.boot.bean;

import lombok.*;

/**
 * @author zhanghu
 * @create 2022-03-24 21:09
 */

@EqualsAndHashCode
@ToString
//@AllArgsConstructor//有参构造器
@NoArgsConstructor //无参构造器
@Data
public class User {
    private String name;
    private Integer age;

    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
