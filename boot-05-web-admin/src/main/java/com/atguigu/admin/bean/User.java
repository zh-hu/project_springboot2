package com.atguigu.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhanghu
 * @create 2022-03-27 10:41
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @TableField(exist = false)  //当前属性表中不存在
    private String userName;
    @TableField(exist = false)
    private String password;


    private Long id;
    private String name;
    private Integer age;
    private String email;
}
