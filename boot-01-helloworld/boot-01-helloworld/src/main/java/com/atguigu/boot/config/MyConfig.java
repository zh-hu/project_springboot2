package com.atguigu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhanghu
 * @create 2022-03-24 21:14
 * 配置类里面使用@bean编著在方法上给容器注册组件，默认也是单实例的
 * 配置类本身也是组件
 * proxyBeanMethods:代理bean的方法
 *      full(proxyBeanMethods = true)
 *      lite(proxyBeanMethods = false)
 *      组件依赖必须使用Full模式默认，其他默认是否Lite模式
 *
 * 4. @import({User.class, DBHelper.class})
 *      给容器中自动创建出这两个类型的组件,默认组件的名字就是全类名
 *
 *
 */
//@ConditionalOnBean(name = "tom")
    @ConditionalOnMissingBean(name = "tom")
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = false) //告诉springboot是一个配置类==配置文件
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)//开始car自动装配配置，把car这个组件自动注册到容器中
public class MyConfig {

    /**
     * Full:外部无论对配置类中的这个组件注册方法调用多少次的都是之前注册容器中的单实例对象
     * @return
     */

    @Bean //给容器中添加组件，以方法名作为组件的id，返回值类型就是组件类型
    public User user01(){
        User zhangsan = new User("zhangsan", 18);
        //user组件依赖了pet组件
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }

    @Bean("tom22")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
