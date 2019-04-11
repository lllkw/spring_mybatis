package com.lkw.mapper;

import com.lkw.dto.MenuInfoDto;
import com.lkw.vo.MenuInfoVo;

import java.util.List;

public interface IMenuInfoMapper {
    public List<MenuInfoDto> getAllMenu(int roleId);

    public int deleteRoleMenu(MenuInfoVo menuInfoVo);

    public int updateRoleMenu(MenuInfoVo menuInfoVo);
}
