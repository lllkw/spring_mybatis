package com.lkw.service;

import com.lkw.pojo.MenuInfo;
import com.lkw.pojo.UserInfo;
import com.lkw.vo.UserInfoVo;
import com.lkw.vo.UserRoleVo;

import java.util.List;
import java.util.Map;

public interface IUserInfoService {
    public UserInfo findUserInfoById(int id);

    public boolean loginCheck(UserInfo userInfo);

    public boolean addUserInfo(UserInfo userInfo);

    public boolean updateUserInfo(UserInfo userInfo);

    public boolean deleteUserInfo(UserInfo userInfo);

    public List<UserInfo> selectByPaging(Map<String,Object> map);

    public List<UserInfo> getUserInfoBy(UserInfo userInfo);

    public List<UserInfo> getUserInfosPageBy(UserInfoVo userInfoVo);

    public int getCount(UserInfoVo userInfoVo);

    public boolean batchDel(UserInfoVo userInfoVo);

    public boolean updateUserRole(UserRoleVo userRoleVo);

    public boolean clearStatus(UserRoleVo userRoleVo);

    List<MenuInfo> getMenuByUserId(int userId);
}
