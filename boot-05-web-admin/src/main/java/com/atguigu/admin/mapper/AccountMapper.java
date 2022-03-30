package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhanghu
 * @create 2022-03-28 17:54
 */
@Deprecated
@Mapper
public interface AccountMapper {

    public Account getAcct(Long id);
}
