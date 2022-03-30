package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import com.atguigu.admin.exception.UserTooManyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhanghu
 * @create 2022-03-27 10:59
 */
@Controller
public class TableController {


    /**
     * 不带请求的参数或者参数类型不对 400 ：Bad Request 一般都是浏览器的的参数没有传递正确
     * @param a
     * @return
     */
    @GetMapping("/basic_table")
    public String basic_table(@RequestParam("a") int a){
        int i=10/0;
        return "table/basic_table";
    }

    //@GetMapping("/dynamic_table")
    //public String dynamic_table(Model model){
    //    //表格内容的遍历
    //    List<User> users = Arrays.asList(new User("zhangsan", "123456"),
    //            new User("lisi", "123444"),
    //            new User("haha", "aaaaa"),
    //            new User("hehe ", "aaddd"));
    //    model.addAttribute("users",users);
    //
    //    if(users.size()>3){
    //        throw new UserTooManyException();
    //    }
    //    return "table/dynamic_table";
    //}

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
