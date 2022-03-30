package com.atguigu.admin.controller;

import com.atguigu.admin.bean.Account;
import com.atguigu.admin.bean.City;
import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.AccountService;
import com.atguigu.admin.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author zhanghu
 * @create 2022-03-26 17:44
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //@Autowired
    //AccountService accountService;
    //
    //@Autowired
    //CityService cityService;
    //
    //@ResponseBody
    //@GetMapping("/city")
    //public City getCityById(@RequestParam("id")Long id){
    //    return cityService.getById(id);
    //}
    //
    //@ResponseBody
    //@GetMapping("/acct")
    //public Account getById(@RequestParam("id") Long id){
    //
    //    return accountService.getAcctById(id);
    //}

    @ResponseBody
    @GetMapping("/sql")
    public String queryFormDb(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_user", Long.class);
        return aLong.toString();
    }

    /**
     * 登录页
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){

        return "login";
    }

    @PostMapping("/login")
    public String main(User user , HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName())&& "123456".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
            //重定向到main页面;防止表单重复提交
            return "redirect:/main.html";
        }
        else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }

    }

    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){

        log.info("当前方法是：{}","mainPage");
        //判断是否登陆
        //Object loginUser = session.getAttribute("loginUser");
        //if(loginUser !=null){
        //    return "main";
        //}else {
        //    model.addAttribute("msg","请重新登录");
        //    return "login";
        //}
        return "main";
    }
}
