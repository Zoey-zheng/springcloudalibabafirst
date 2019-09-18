package com.zhengyj.spring.cloud.alibaba.nacos.provider.repository;

import com.zhengyj.spring.cloud.alibaba.nacos.provider.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewReposity extends JpaRepository<Users,Integer> {

}
