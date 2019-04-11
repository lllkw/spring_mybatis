package com.lkw.vo;

import com.lkw.tools.Page;

import java.util.Arrays;

public class UserInfoVo {
    String username;
    String name;
    String email;
    int[] ids;

    Page page;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ids=" + Arrays.toString(ids) +
                ", page=" + page +
                '}';
    }
}
