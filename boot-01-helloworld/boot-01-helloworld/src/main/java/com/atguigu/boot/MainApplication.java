package com.atguigu.boot;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zhanghu
 * @create 2022-03-24 18:01
 *  主程序类
 * @SpringBootApplicatio：这是一个springboot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //1.返回Aoc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        boolean tom = run.containsBean("tom");
        System.out.println("容器中tom组件"+tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件"+user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中user01组件"+tom22);

        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");

        System.out.println("haha"+haha);
        System.out.println("hehe"+hehe);
        ////3.从容器获得组件
        //Pet tom = run.getBean("tom", Pet.class);
        //
        //Pet tom1 = run.getBean("tom", Pet.class);
        //
        //System.out.println("组件："+(tom1 == tom));
        //
        //MyConfig bean = run.getBean(MyConfig.class);
        //
        //System.out.println(bean);
        //
        ////4.如果@Configuration(proxyBeanMethods = true)代理对象调用方法。springboot总会检查这个组件是否在容器中存在
        ////保持组件单实例
        //User user = bean.user01();
        //
        //User user1 = bean.user01();
        //
        //System.out.println(user == user1);
        //
        //User user01 = run.getBean("user01", User.class);
        //
        //Pet tom2 = run.getBean("tom", Pet.class);
        //System.out.println("用户的宠物："+ (user01.getPet() == tom2));
        //
        ////5.获取组件
        //
        //String[] beanNamesForType = run.getBeanNamesForType(User.class);
        //System.out.println("=====");
        //for(String s : beanNamesForType ){
        //    System.out.println(s);
        //}
        //
        //DBHelper bean1 = run.getBean(DBHelper.class);
        //System.out.println(bean1);

    }
}
