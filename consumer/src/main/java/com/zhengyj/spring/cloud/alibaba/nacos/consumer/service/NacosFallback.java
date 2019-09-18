package com.zhengyj.spring.cloud.alibaba.nacos.consumer.service;

import com.zhengyj.spring.cloud.alibaba.nacos.consumer.entity.Users;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author: zhengyingjun
 * @date: 2019/9/9 8:26 AM
 * @description: 熔断处理
 *
 */
@Component
public class NacosFallback implements INacosService{
    @Override
    public String nacos(String message) {
        return "当前网络忙，请稍后再试";
    }

    @Override
    public Collection<Users> selectAll() {
        System.out.println("111");
        return null;
    }

    @Override
    public Users getOne(Integer id) {
        System.out.println("222");
        return null;
    }
}
