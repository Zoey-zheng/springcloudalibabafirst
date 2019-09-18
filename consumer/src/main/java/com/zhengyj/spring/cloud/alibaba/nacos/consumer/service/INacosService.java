package com.zhengyj.spring.cloud.alibaba.nacos.consumer.service;

import com.zhengyj.spring.cloud.alibaba.nacos.consumer.entity.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

/**
 * @author: zhengyingjun
 * @date: 2019/9/8 9:42 PM
 * @description:
 *
 */
@FeignClient(value = "nacos-provider",fallback = NacosFallback.class)
public interface INacosService {
    @GetMapping(value = "/nacos/{message}")
    String nacos(@PathVariable("message") String message);

    @GetMapping(value = "/nacos/selectAll")
    Collection<Users> selectAll();


    @GetMapping(value = "/nacos/getOne/{id}")
     Users getOne(@PathVariable("id") Integer id);



}






