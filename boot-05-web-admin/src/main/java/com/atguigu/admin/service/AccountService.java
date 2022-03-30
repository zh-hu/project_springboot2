package com.atguigu.admin.service;

import com.atguigu.admin.bean.Account;
import com.atguigu.admin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhanghu
 * @create 2022-03-28 18:07
 */
@Deprecated
@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAcctById(Long id){
        return  accountMapper.getAcct(id);
    }
}
