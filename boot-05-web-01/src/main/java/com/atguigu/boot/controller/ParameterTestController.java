package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhanghu
 * @create 2022-03-25 16:09
 */
@RestController
public class ParameterTestController {

    @PostMapping("saveuser")
    public Person savaUser(Person person){
        return person;
    }

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam Integer age,
                                     @RequestParam("inters") List<String> inters,
                                     @PathVariable Map<String,String> params
                                     //@CookieValue("_ga") String _ga,
                                     //@CookieValue("_ga") Cookie cookie
                                     ){
        Map<String, Object> map = new HashMap<>();
        //map.put("id",id);
        //map.put("name",name);
        //map.put("pv",pv);
        //map.put("UserAgent",userAgent);
        //map.put("headers",header);

        map.put("age",age);
        map.put("inters",inters);
        map.put("params",params);
        //map.put("_ga",_ga);
        //System.out.println(cookie.getName() +"====>"+cookie.getValue());
        return map;
    }
    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content",content);
        return map;
    }

    @GetMapping("/cars/sell")
    public Map careSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand") List<String> brand){
        Map<String, Object> map = new HashMap<>();

        map.put("low",low);
        map.put("brand",brand);
        return map;
    }

    //1???????????? ???????????????/cars/sell;low=34;brand=byd,audi,yd
    //2???SpringBoot???????????????????????????????????????
    //      ????????????????????????????????????????????????UrlPathHelper???????????????
    //              removeSemicolonContent?????????????????????????????????????????????
    //3????????????????????????url???????????????????????????
    @GetMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand") List<String> brand,
                        @PathVariable("path") String path){
        Map<String,Object> map = new HashMap<>();

        map.put("low",low);
        map.put("brand",brand);
        map.put("path",path);
        return map;
    }

    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,
                    @MatrixVariable(value = "age",pathVar = "empId") Integer empAge){
        Map<String,Object> map = new HashMap<>();

        map.put("bossAge",bossAge);
        map.put("empAge",empAge);
        return map;

    }
}
