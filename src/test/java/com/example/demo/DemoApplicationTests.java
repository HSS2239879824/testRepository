package com.example.demo;

import com.example.demo.mapper.SysUserMapper;
import com.example.demo.po.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void contextLoads() {
        try {
            List<SysUser> userList = sysUserMapper.selectAll();
            for (SysUser user:userList){
                System.out.println(user.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
