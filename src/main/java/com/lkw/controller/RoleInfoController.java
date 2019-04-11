package com.lkw.controller;

import com.lkw.dto.RoleInfoDto;
import com.lkw.pojo.RoleInfo;
import com.lkw.pojo.UserInfo;
import com.lkw.service.IRoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class RoleInfoController {

    @Autowired
    IRoleInfoService roleInfoService;

    @RequestMapping(value = "getRoleByUserId",method = RequestMethod.POST)
    public List<RoleInfoDto> getRoleByUserId(@RequestParam int userId){
        return roleInfoService.getRoleInfoBy(userId);
    }

    @RequestMapping(value = "getAllRole")
    public List<RoleInfo> getAllRole(HttpSession session){
        UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
        return roleInfoService.getAllRole(userInfo.getUserId());
    }
}
