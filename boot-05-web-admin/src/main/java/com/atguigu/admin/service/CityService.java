package com.atguigu.admin.service;

import com.atguigu.admin.bean.City;
import com.atguigu.admin.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhanghu
 * @create 2022-03-29 11:44
 */
@Deprecated
@Service
public class CityService {

    @Autowired
   CityMapper cityMapper;

    public City getById(Long id){
      return   cityMapper.getById(id);
    }
}
