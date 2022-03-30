package com.atguigu.admin.acutuator.health.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

import java.util.Collections;

/**
 * @author zhanghu
 * @create 2022-03-29 16:52
 */
public class AppInfoInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("msg","你好")
                .withDetail("hello","atguigu")
                .withDetails(Collections.singletonMap("world","666600"));
    }
}
