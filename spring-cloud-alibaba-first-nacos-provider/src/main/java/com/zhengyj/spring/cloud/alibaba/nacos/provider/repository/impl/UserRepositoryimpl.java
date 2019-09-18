package com.zhengyj.spring.cloud.alibaba.nacos.provider.repository.impl;

import com.zhengyj.spring.cloud.alibaba.nacos.provider.entity.Users;
import com.zhengyj.spring.cloud.alibaba.nacos.provider.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhengyingjun
 * @date: 2019/9/18 9:11 PM
 * @description:
 *
 */
@Repository
public class UserRepositoryimpl implements UserRepository {

    private static Map<Integer,Users> map;

    static{
        map = new HashMap<>();
        map.put(1,new Users(1,"张三","23"));
        map.put(2,new Users(2,"李四","24"));
        map.put(3,new Users(3,"王五","25"));
    }



    @Override
    public Collection<Users> getAll() {
        return map.values();
    }

    @Override
    public Users getOneByid(Integer id) {
        return map.get(id);
    }
}
