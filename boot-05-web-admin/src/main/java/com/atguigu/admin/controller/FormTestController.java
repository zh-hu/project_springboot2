package com.atguigu.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author zhanghu
 * @create 2022-03-27 16:59
 */
@Slf4j
@Controller
public class FormTestController {

    @GetMapping("form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }

    /**
     * MultipartFile 自动封装上传的文件
     * @param email
     * @param username
     * @param headerImg
     * @param photos
     * @return
     */
    @PostMapping("/upload")
    public String uploads(@RequestParam("email") String email,
                          @RequestParam("username") String username,
                          @RequestParam("headerImg")MultipartFile headerImg,
                          @RequestParam("photos") MultipartFile[] photos) throws IOException {

        log.info("上传的信息：email={},username={},headerImg={},photos={}",
                                    email,username,headerImg.getSize(),photos.length );
        if(!headerImg.isEmpty()){
            //保存到服务器中，oss服务器
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("D:\\学习过程\\java\\尚硅谷\\springboot2\\zhaopian\\"+originalFilename));

        }
        if(photos.length >0){
            for(MultipartFile photo :photos){
                if(!photo.isEmpty()){
                    String originalFilename = photo.getOriginalFilename();
                    photo.transferTo(new File("D:\\学习过程\\java\\尚硅谷\\springboot2\\zhaopian\\"+originalFilename));
                }
            }
        }
        return "main";
    }
}
