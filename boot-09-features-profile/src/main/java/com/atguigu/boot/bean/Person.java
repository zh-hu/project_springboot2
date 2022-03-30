package com.atguigu.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhanghu
 * @create 2022-03-29 20:17
 */


public interface Person {

    String getName();
    Integer getAge();
}
