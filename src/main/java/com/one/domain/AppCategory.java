package com.one.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *  分类
 */
public class AppCategory implements Serializable {

    private Integer id; //主键id
    private String categoryCode; //分类编码
    private String categoryName; //分类名称
    private Integer parentId; //父节点id
    private Integer createdBy; //创建者（来源于backend_user用户表的用户id）
    private Date creationTime; //创建时间
    private Integer modifyBy; //更新者（来源于backend_user用户表的用户id）
    private Date modifyDate; //最新更新时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "AppCategory{" +
                "id=" + id +
                ", categoryCode='" + categoryCode + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", parentId=" + parentId +
                ", createdBy=" + createdBy +
                ", creationTime=" + creationTime +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
