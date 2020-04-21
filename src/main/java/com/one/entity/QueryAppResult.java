package com.one.entity;

import java.io.Serializable;

public class QueryAppResult implements Serializable {

    private String softwareName; //软件名称
    private String APKName;  //APK名称  唯一
    private String softwareSize; //软件大小 M
    private String flatformStr; // 所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）
    private String levels; //分类字符串
    private String statusStr; //状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）
    private String versionStr; //版本字符串

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getAPKName() {
        return APKName;
    }

    public void setAPKName(String APKName) {
        this.APKName = APKName;
    }

    public String getSoftwareSize() {
        return softwareSize;
    }

    public void setSoftwareSize(String softwareSize) {
        this.softwareSize = softwareSize;
    }

    public String getFlatformStr() {
        return flatformStr;
    }

    public void setFlatformStr(String flatformStr) {
        this.flatformStr = flatformStr;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getVersionStr() {
        return versionStr;
    }

    public void setVersionStr(String versionStr) {
        this.versionStr = versionStr;
    }
}
