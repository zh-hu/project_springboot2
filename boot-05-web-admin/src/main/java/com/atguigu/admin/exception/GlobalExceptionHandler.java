package com.atguigu.admin.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author zhanghu
 * @create 2022-03-28 11:11
 * 处理整个web controller的异常
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ArithmeticException.class,NullPointerException.class}) //异常处理
    public String handleArithException(Exception e){
        log.error("异常是:{}",e);
        return "login";//视图地址
    }
}
