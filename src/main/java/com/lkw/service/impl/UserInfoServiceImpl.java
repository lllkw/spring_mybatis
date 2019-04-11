package com.lkw.service.impl;

import com.lkw.mapper.IUserInfoMapper;
import com.lkw.pojo.MenuInfo;
import com.lkw.pojo.UserInfo;
import com.lkw.service.IUserInfoService;
import com.lkw.vo.UserInfoVo;
import com.lkw.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    IUserInfoMapper userInfoMapper;

    public UserInfo findUserInfoById(int id) {
        UserInfo userInfo = userInfoMapper.findUserInfoById(id);
        return userInfo;
    }

    public boolean loginCheck(UserInfo userInfo) {
        if(userInfoMapper.loginCheck(userInfo) != null){
            return true;
        }
        return false;
    }

    public boolean addUserInfo(UserInfo userInfo) {
        int count = userInfoMapper.addUserInfo(userInfo);
        if(count > 0){
            return true;
        }
        return false;
    }

    public boolean updateUserInfo(UserInfo userInfo) {
        int count = userInfoMapper.updateUserInfo(userInfo);
        if (count > 0) {
            return true;
        }
        return false;
    }

    public boolean deleteUserInfo(UserInfo userInfo) {
        int count = userInfoMapper.deleteUserInfo(userInfo);
        System.out.println(111);
        if(count > 0){
            return true;
        }
        return false;
    }

    public List<UserInfo> selectByPaging(Map<String, Object> map) {
        List<UserInfo> list = new ArrayList<UserInfo>();
        list = userInfoMapper.selectByPaging(map);
        return list;
    }

    public List<UserInfo> getUserInfoBy(UserInfo userInfo) {
        return userInfoMapper.getUserInfoBy(userInfo);
    }

    public List<UserInfo> getUserInfosPageBy(UserInfoVo userInfoVo) {
        return userInfoMapper.getUserInfosPageBy(userInfoVo);
    }

    public int getCount(UserInfoVo userInfoVo) {
        return userInfoMapper.getCount(userInfoVo);
    }

    public boolean batchDel(UserInfoVo userInfoVo) {
        int count = userInfoMapper.batchDel(userInfoVo);
        if(count > 0){
            return true;
        }
        return false;
    }

    public boolean updateUserRole(UserRoleVo userRoleVo) {
        userInfoMapper.clearStatus(userRoleVo);
        userInfoMapper.updateStatus(userRoleVo);

        return true;
    }

    public boolean clearStatus(UserRoleVo userRoleVo) {
        if(userInfoMapper.clearStatus(userRoleVo) > 0){
            return true;
        }
        return false;
    }

    public List<MenuInfo> getMenuByUserId(int userId) {
        return userInfoMapper.getMenuByUserId(userId);
    }


}
