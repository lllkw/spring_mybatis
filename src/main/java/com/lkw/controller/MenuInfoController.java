package com.lkw.controller;

import com.lkw.dto.MenuInfoDto;
import com.lkw.service.IMenuInfoService;
import com.lkw.vo.MenuInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuInfoController {
    @Autowired
    IMenuInfoService menuInfoService;

    @RequestMapping("getAllMenu")
    public List<MenuInfoDto> getAllMenu(@RequestParam Integer roleId){
        if(roleId == null){
            return null;
        }else{
            return menuInfoService.getAllMenu(roleId);
        }
    }

    @RequestMapping("updateMenuInfo")
    public boolean updateMenuInfo(@RequestBody MenuInfoVo menuInfoVo){
        System.out.println(menuInfoVo);
        boolean flag = true;
        if(menuInfoVo.getMenuIds().length == 0){
            flag = true;
        }else{
            flag = menuInfoService.updateRoleMenu(menuInfoVo);
        }

        return flag;
    }
}
