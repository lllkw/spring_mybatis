package com.lkw.service.impl;

import com.lkw.dto.MenuInfoDto;
import com.lkw.mapper.IMenuInfoMapper;
import com.lkw.service.IMenuInfoService;
import com.lkw.vo.MenuInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MenuInfoServiceImpl implements IMenuInfoService {

    @Autowired
    IMenuInfoMapper menuInfoMapper;

    public List<MenuInfoDto> getAllMenu(int roleId) {
        return menuInfoMapper.getAllMenu(roleId);
    }

    public boolean deleteRoleMenu(MenuInfoVo menuInfoVo) {
        if(menuInfoMapper.deleteRoleMenu(menuInfoVo) > 0){
            return true;
        }
        return false;
    }

    public boolean updateRoleMenu(MenuInfoVo menuInfoVo) {
        menuInfoMapper.deleteRoleMenu(menuInfoVo);
        menuInfoMapper.updateRoleMenu(menuInfoVo);
        return true;
    }
}
