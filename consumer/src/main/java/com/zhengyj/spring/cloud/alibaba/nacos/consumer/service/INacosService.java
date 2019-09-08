package com.zhengyj.spring.cloud.alibaba.nacos.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * @author: zhengyingjun
 * @date: 2019/9/8 9:42 PM
 * @description:
 *
 */
@FeignClient(value = "nacos-provider")
public interface INacosService {
    @GetMapping(value = "/nacos/{message}")
    String nacos(@PathVariable("message") String message);
}






