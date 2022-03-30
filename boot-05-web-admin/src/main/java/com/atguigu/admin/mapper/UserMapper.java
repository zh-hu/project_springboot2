package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhanghu
 * @create 2022-03-29 12:08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
