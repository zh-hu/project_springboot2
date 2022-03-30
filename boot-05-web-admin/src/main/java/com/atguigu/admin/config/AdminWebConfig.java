package com.atguigu.admin.config;

import com.atguigu.admin.interceptor.LoginInterceptor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zhanghu
 * @create 2022-03-27 15:28
 * 1.编写一个拦截器HandlerInterceptor接口
 * 2.拦截器注册到容器中，是极限WebMvcConfigurer的addInterceptor
 * 3.指定拦截规则（如果是拦截所有，静态资源也会被拦截）
 *
 * @EnableWebMvc:全面接管
 *      1.静态资源？视图解析器？欢迎页。。。全部失效
 */
//@EnableWebMvc
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    /**
     * 访问 /aa/** 所有请求都去classpath：/static/ 下面进行匹配
     * @param registry
     */

    //@Override
    //public void addResourceHandlers(ResourceHandlerRegistry registry) {
    //    registry.addResourceHandler("/static/**")
    //            .addResourceLocations("classpath:/static/");
    //}

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())

                //所用请求都被拦截，包括静态资源
                .addPathPatterns("/**")
                //放行的请求
                .excludePathPatterns("/","/login","/css/**","/fonts/**",
                        "/images/**","/js/**","/aa/**","/sql");

    }




}
