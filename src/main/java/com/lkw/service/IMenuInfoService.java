package com.lkw.service;

import com.lkw.dto.MenuInfoDto;
import com.lkw.vo.MenuInfoVo;

import java.util.List;

public interface IMenuInfoService {
    public List<MenuInfoDto> getAllMenu(int roleId);

    public boolean deleteRoleMenu(MenuInfoVo menuInfoVo);

    public boolean updateRoleMenu(MenuInfoVo menuInfoVo);
}
