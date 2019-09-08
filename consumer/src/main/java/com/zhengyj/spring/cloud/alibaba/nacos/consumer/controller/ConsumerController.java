package com.zhengyj.spring.cloud.alibaba.nacos.consumer.controller;

import com.zhengyj.spring.cloud.alibaba.nacos.consumer.service.INacosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author: zhengyingjun
 * @date: 2019/9/8 9:45 PM
 * @description:
 *
 */
@RestController
public class ConsumerController {

    @Autowired
    private INacosService iNacosService;

    @GetMapping("/print")
    public String print(){
        return iNacosService.nacos("123");
    }

}
