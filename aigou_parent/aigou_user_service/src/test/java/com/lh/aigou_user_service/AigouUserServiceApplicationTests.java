package com.lh.aigou_user_service;

import com.lh.aigou_user_service.entity.SysUser;
import com.lh.aigou_user_service.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AigouUserServiceApplicationTests {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void contextLoads() {
        SysUser sysUser = new SysUser();
        sysUser.setSysUserName("admin");
        sysUserService.addUser(sysUser);
    }

}
