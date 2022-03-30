package com.atguigu.hello.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhanghu
 * @create 2022-03-30 13:17
 */
@ConfigurationProperties("atguigu.hello")
public class HelloPoperties {

    private String perfix;
    private String suffix;

    public String getPerfix() {
        return perfix;
    }

    public void setPerfix(String perfix) {
        this.perfix = perfix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
