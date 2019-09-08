package com.zhengyj.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author: zhengyingjun
 * @date: 2019/9/8 9:42 PM
 * @description:
 *
 */
@RestController
public class ProviderController {


    @GetMapping(value = "/nacos/{message}")
    public String nacos(@PathVariable("message") String message){
        return message;
    }
}
