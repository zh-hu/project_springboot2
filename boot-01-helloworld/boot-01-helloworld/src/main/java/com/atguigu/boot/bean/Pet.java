package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author zhanghu
 * @create 2022-03-24 21:09
 */

@ToString
@AllArgsConstructor//有参构造器
@NoArgsConstructor //无参构造器
@Data
public class Pet {
    private String name;

}
