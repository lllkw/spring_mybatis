package com.lkw.controller;

import com.lkw.dto.UserInfoDto;
import com.lkw.pojo.MenuInfo;
import com.lkw.pojo.RoleInfo;
import com.lkw.pojo.UserInfo;
import com.lkw.service.IUserInfoService;
import com.lkw.tools.Page;
import com.lkw.vo.UserInfoVo;
import com.lkw.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserInfoController {
    @Autowired
    IUserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public String test(){
        return "Hello World";
    }

    @ResponseBody
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
        public String loginCheck(@RequestBody UserInfo userInfo, HttpSession session){
        Boolean flag = false;
        flag = userInfoService.loginCheck(userInfo);
        List<UserInfo> userInfoBy = userInfoService.getUserInfoBy(userInfo);
        if(flag){
            session.setAttribute("userInfo",userInfoBy.get(0));
        }
        return flag.toString();
    }

    @ResponseBody
    @RequestMapping(value = "selectByPaging")
    public Object selectByPaging(@RequestBody UserInfoVo userInfoVo,HttpSession session){
        List<UserInfo> userInfoList = userInfoService.getUserInfosPageBy(userInfoVo);
        Page page = new Page();
        int count = userInfoService.getCount(userInfoVo);
        page.setCurrentPage(userInfoVo.getPage().getCurrentPage());
        page.setTotalCount(count);
        page.setPageCount(count%page.getPageSize()==0?count/page.getPageSize():(count/page.getPageSize())+1);
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setPage(page);
        userInfoDto.setUserInfoList(userInfoList);
        return userInfoDto;
    }

    @ResponseBody
    @RequestMapping(value = "getUserInfoBy",method = RequestMethod.POST)
    public Object getUserInfoBy(@RequestBody(required = false) UserInfo userInfo){
        List<UserInfo> userInfoList = this.userInfoService.getUserInfoBy(userInfo);
        return userInfoList;
    }

    @ResponseBody
    @RequestMapping(value = "findUserInfoById",method = RequestMethod.POST)
    public Object findUserInfoById(@RequestBody UserInfo userInfo){
        userInfo = userInfoService.findUserInfoById(userInfo.getUserId());
        return userInfo;
    }

    @ResponseBody
    @RequestMapping(value = "updateUserInfo")
    public boolean updateUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        boolean flag = userInfoService.updateUserInfo(userInfo);
        System.out.println(flag);
        return flag;
    }

    @ResponseBody
    @RequestMapping(value = "deleteUserInfo")
    public boolean deleteUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        boolean flag = userInfoService.deleteUserInfo(userInfo);
        return flag;
    }

    @ResponseBody
    @RequestMapping(value = "addUserInfo")
    public boolean addUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        boolean flag = userInfoService.addUserInfo(userInfo);
        return flag;
    }

    @ResponseBody
    @RequestMapping(value = "batchDel")
    public boolean batchDel(@RequestBody UserInfoVo userInfoVo){
        boolean flag = userInfoService.batchDel(userInfoVo);
        return flag;
    }

    @ResponseBody
    @RequestMapping("updateUserRole")
    public boolean updateUserRole(@RequestBody UserRoleVo userRoleVo){
        boolean flag = true;
        if(userRoleVo.getRoleids().length == 0){
            flag = true;
        }else{
            flag = userInfoService.updateUserRole(userRoleVo);
        }

        return flag;
    }

    @ResponseBody
    @RequestMapping("getMenuByUserId")
    public List<MenuInfo> getMenuByUserId(HttpSession session){
        UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
        int userId = userInfo.getUserId();
        List<MenuInfo> menuInfoList = userInfoService.getMenuByUserId(userId);
        return menuInfoList;
    }

}
