package com.atguigu.admin.acutuator.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanghu
 * @create 2022-03-29 16:40
 */
public class MyComHealthIndicator extends AbstractHealthIndicator {
    /**
     * 真是的检查方法
     * @param builder
     * @throws Exception
     */
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        //mongdb 获取连接进行测试
        Map<String, Object> map = new HashMap<>();
        //检查完成
        if(1==1){
            //builder.up();//健康
            builder.status(Status.UP);
            map.put("count",1);
            map.put("ms",100);
        }else {
            builder.status(Status.OUT_OF_SERVICE);
            map.put("err","连接超时");
            map.put("ms",3000);
        }

        builder.withDetail("code",100).withDetails(map);

    }
}
