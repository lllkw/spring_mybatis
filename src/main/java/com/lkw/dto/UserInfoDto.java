package com.lkw.dto;

import com.lkw.pojo.UserInfo;
import com.lkw.tools.Page;

import java.util.List;

public class UserInfoDto {
    List<UserInfo> userInfoList;
    Page page;

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "UserInfoDto{" +
                "userInfoList=" + userInfoList +
                ", page=" + page +
                '}';
    }
}
