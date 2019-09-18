package com.zhengyj.spring.cloud.alibaba.nacos.provider.controller;

import com.zhengyj.spring.cloud.alibaba.nacos.provider.entity.Users;
import com.zhengyj.spring.cloud.alibaba.nacos.provider.repository.NewReposity;
import com.zhengyj.spring.cloud.alibaba.nacos.provider.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

/**
 * @author: zhengyingjun
 * @date: 2019/9/8 9:42 PM
 * @description:
 *
 */
@Api(tags = "生产者控制",description = "提供相应接口")
@RestController
@RequestMapping("/nacos/")
public class ProviderController {

    @Autowired
    //private UserRepository userRepository;
   private NewReposity userRepository;
    /**
     * 便于显示负载效果
     */
    @Value("${server.port}")
    private String port;

    @ApiOperation("测试负载")
    @GetMapping(value = "{message}")
    public String nacos(@PathVariable("message") String message){
        return message+" 来自："+port;
    }

    @ApiOperation("测试获取用户")
    @GetMapping(value = "selectAll")
    public Collection<Users> selectAll(){
        return userRepository.findAll();
    }

    @ApiOperation("查询单个用户")
    @GetMapping(value = "getOne/{id}")
    public Users getOne(@PathVariable("id") Integer id){
        return userRepository.getOne(id);
    }

}
