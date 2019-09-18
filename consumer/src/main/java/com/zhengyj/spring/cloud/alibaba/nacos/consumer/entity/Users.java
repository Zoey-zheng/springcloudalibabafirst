package com.zhengyj.spring.cloud.alibaba.nacos.consumer.entity;


import java.io.Serializable;

/**
 * @author: zhengyingjun
 * @date: 2019/9/18 8:54 PM
 * @description: 用户实体类
 *
 */
public class Users implements Serializable {


    private static final long serialVersionUID = 9061240406537771864L;

    private Integer id;
    private String username;
    private String password;
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

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
