package com.example.demo.mapper;

import com.example.demo.po.SysUser;

import java.util.List;

public interface SysUserMapper {
    //查询所有用户
    List<SysUser> selectAll()throws Exception;

}
