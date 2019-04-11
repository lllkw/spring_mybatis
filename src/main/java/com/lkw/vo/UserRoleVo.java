package com.lkw.vo;

import java.util.Arrays;

public class UserRoleVo {
    int userId;
    int[] roleIds;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int[] getRoleids() {
        return roleIds;
    }

    public void setRoleids(int[] roleids) {
        this.roleIds = roleids;
    }

    @Override
    public String toString() {
        return "UserRoleVo{" +
                "userId=" + userId +
                ", roleids=" + Arrays.toString(roleIds) +
                '}';
    }
}
