package com.lkw.service.impl;

import com.lkw.dto.RoleInfoDto;
import com.lkw.mapper.IRoleInfoMapper;
import com.lkw.pojo.RoleInfo;
import com.lkw.service.IRoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements IRoleInfoService {

    @Autowired
    IRoleInfoMapper roleInfoMapper;

    public List<RoleInfoDto> getRoleInfoBy(int id) {
        return roleInfoMapper.getRoleInfoBy(id);
    }

    public List<RoleInfo> getAllRole(int id) {
        return roleInfoMapper.getAllRole(id);
    }
}
