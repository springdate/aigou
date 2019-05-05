package com.lh.aigou_user_service.service.impl;

import com.lh.aigou_user_service.entity.SysUser;
import com.lh.aigou_user_service.mapper.SysUserMapper;
import com.lh.aigou_user_service.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void addUser(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }
}
