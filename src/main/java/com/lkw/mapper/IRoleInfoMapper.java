package com.lkw.mapper;

import com.lkw.dto.RoleInfoDto;
import com.lkw.pojo.RoleInfo;

import java.util.List;

public interface IRoleInfoMapper {
    public List<RoleInfoDto> getRoleInfoBy(int id);

    public List<RoleInfo> getAllRole(int id);
}
