package com.atguigu.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author zhanghu
 * @create 2022-03-29 20:23
 */
@Profile(value = {"prod","default"})
@Component
@ConfigurationProperties("person")
@Data
public class Boss implements Person{

    private String name;
    private Integer age;


}
