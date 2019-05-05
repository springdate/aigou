package com.lh.aigou_user_service.controller;

import com.lh.aigou_common_parent.base.BaseController;
import com.lh.aigou_common_parent.bean.ResponseBean;
import com.lh.aigou_user_service.entity.SysUser;
import com.lh.aigou_user_service.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysUser")
public class SysUserController extends BaseController {

    @Autowired
    private SysUserService userService;

    @PostMapping("/addUser")
    public ResponseBean<Void> addUser(SysUser sysUser){
        userService.addUser(sysUser);
        return success();
    }

    @GetMapping("get")
    public ResponseBean<String> get(){
        return successMsg("漩涡鸣人");
    }
}
