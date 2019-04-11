package com.lkw.pojo;

public class MenuInfo {
    int menuid;
    String menuname;
    String menupath;
    String menuicon;
    int parentid;

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenupath() {
        return menupath;
    }

    public void setMenupath(String menupath) {
        this.menupath = menupath;
    }

    public String getMenuicon() {
        return menuicon;
    }

    public void setMenuicon(String menuicon) {
        this.menuicon = menuicon;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menuid=" + menuid +
                ", menuname='" + menuname + '\'' +
                ", menupath='" + menupath + '\'' +
                ", menuicon='" + menuicon + '\'' +
                ", parentid=" + parentid +
                '}';
    }
}
