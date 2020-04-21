package com.one.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "dev_user")
public class DevUser implements Serializable {

    @Id
    private Long id; //id
    private String devCode; //开发者账户
    private String devName; //开发者名称
    private String devPassword; //账户密码
    private String devEmail; //开发者邮箱
    private String devInfo; //开发者简介
    private Long creatBy; //创建者（来源于backend_user用户表的用户id）
    private Date creationDate; //创建时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevPassword() {
        return devPassword;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword;
    }

    public String getDevEmail() {
        return devEmail;
    }

    public void setDevEmail(String devEmail) {
        this.devEmail = devEmail;
    }

    public String getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(String devInfo) {
        this.devInfo = devInfo;
    }

    public Long getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(Long creatBy) {
        this.creatBy = creatBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "DevUser{" +
                "id=" + id +
                ", devCode='" + devCode + '\'' +
                ", devName='" + devName + '\'' +
                ", devPassword='" + devPassword + '\'' +
                ", devEmail='" + devEmail + '\'' +
                ", devInfo='" + devInfo + '\'' +
                ", creatBy=" + creatBy +
                ", creationDate=" + creationDate +
                '}';
    }
}
