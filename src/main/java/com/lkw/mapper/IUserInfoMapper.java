package com.lkw.mapper;

import com.lkw.pojo.MenuInfo;
import com.lkw.pojo.UserInfo;
import com.lkw.vo.UserInfoVo;
import com.lkw.vo.UserRoleVo;

import java.util.List;
import java.util.Map;

public interface IUserInfoMapper {
    public UserInfo findUserInfoById(int id);

    public UserInfo loginCheck(UserInfo userInfo);

    public int addUserInfo(UserInfo userInfo);

    public int updateUserInfo(UserInfo userInfo);

    public int deleteUserInfo(UserInfo userInfo);

    public List<UserInfo> selectByPaging(Map<String,Object> map);

    public List<UserInfo> getUserInfoBy(UserInfo userInfo);

    public List<UserInfo> getUserInfosPageBy(UserInfoVo userInfoVo);

    public int getCount(UserInfoVo userInfoVo);

    public int batchDel(UserInfoVo userInfoVo);

    public int clearStatus(UserRoleVo userRoleVo);

    public int updateStatus(UserRoleVo userRoleVo);


    List<MenuInfo> getMenuByUserId(int userId);

}
