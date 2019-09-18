package com.zhengyj.spring.cloud.alibaba.nacos.provider.entity;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: zhengyingjun
 * @date: 2019/9/18 8:54 PM
 * @description: 用户实体类
 *
 */
@ApiModel
@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class Users implements Serializable{


    private static final long serialVersionUID = -936648507997051643L;
    @ApiModelProperty("用户id")
    @Id
    private Integer id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("编码")
    private String code;

    public Users(Integer i, String s, String s1) {
    }

    public Users() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Users(Integer id, String username, String password, String code) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.code = code;
    }

//    @Override
//    public String toString() {
//        return JSON.toJSONString(this);
//    }
}
