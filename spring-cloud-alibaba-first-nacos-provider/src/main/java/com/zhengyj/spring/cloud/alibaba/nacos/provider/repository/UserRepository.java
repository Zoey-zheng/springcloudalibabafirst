package com.zhengyj.spring.cloud.alibaba.nacos.provider.repository;

import com.zhengyj.spring.cloud.alibaba.nacos.provider.entity.Users;

import java.util.Collection;

/**
 * @author: zhengyingjun
 * @date: 2019/9/18 9:02 PM
 * @description: 测试swagger用，不代表实际使用
 *
 */

public interface UserRepository {

    /**
     *
     * @return
     */
    Collection<Users> getAll();

    /**
     *
     * @param id
     * @return
     */
    Users getOneByid(Integer id);


}
