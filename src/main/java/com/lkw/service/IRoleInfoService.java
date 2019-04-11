package com.lkw.service;

import com.lkw.dto.RoleInfoDto;
import com.lkw.pojo.RoleInfo;

import java.util.List;

public interface IRoleInfoService {
    public List<RoleInfoDto> getRoleInfoBy(int id);

    public List<RoleInfo> getAllRole(int id);
}
