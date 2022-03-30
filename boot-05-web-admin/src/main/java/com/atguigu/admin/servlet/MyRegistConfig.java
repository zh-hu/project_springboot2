package com.atguigu.admin.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author zhanghu
 * @create 2022-03-28 13:27
 */

@Configuration
public class MyRegistConfig {

    @Bean
    public ServletRegistrationBean myservlet() {

        MyServlet myServlet = new MyServlet();

        return new ServletRegistrationBean(myServlet, "/my", "/my02");
    }

    public FilterRegistrationBean myFilter() {

        MyFilter myFilter = new MyFilter();
        //return new FilterRegistrationBean(myFilter,myservlet());
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/my", "/css/*"));
        return filterRegistrationBean;
    }

    public ServletListenerRegistrationBean myListener(){
        MySwervletContextListener mySwervletContextListener = new MySwervletContextListener();
        return new ServletListenerRegistrationBean();
    }
}
