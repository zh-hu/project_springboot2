package com.atguigu.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author zhanghu
 * @create 2022-03-28 11:20
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量大多")
public class UserTooManyException extends  RuntimeException {

    public UserTooManyException(){

    }

    public UserTooManyException(String message){
        super(message);
    }
}
