package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhanghu
 * @create 2022-03-25 10:28
 */

/**
 * 只有在容器中的组件才会拥有springboot提供的强大功能
 */
@ToString
@AllArgsConstructor//有参构造器
@NoArgsConstructor //无参构造器
@Data
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;

    private Integer price;


}
