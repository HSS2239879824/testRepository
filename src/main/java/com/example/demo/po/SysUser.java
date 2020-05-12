package com.example.demo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

//Lombok的@Data自动生成Getting和Setting方法
@Data
//实现Serializable序列化对象，传输或储存
public class SysUser implements Serializable {
    private Integer id;// INT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    private String accountId;// VARCHAR(26) BINARY UNIQUE NOT NULL COMMENT '账户ID',
    private String password;// VARCHAR(36) NOT NULL COMMENT '密码',
    private String username;// VARCHAR(36) NOT NULL COMMENT '用户名',
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String createdtime;// DATETIME NOT NULL DEFAULT NOW() COMMENT '创建时间',
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String modifiedtime;// DATETIME NOT NULL DEFAULT NOW() COMMENT '修改时间',
    private String userheadimg;// VARCHAR(256) NOT NULL DEFAULT 'default.jpg' COMMENT '用户头像',

}
