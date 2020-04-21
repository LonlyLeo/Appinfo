package com.one.entity;

import java.io.Serializable;

/**
 * 封装查询条件
 */
public class QueryBean implements Serializable{

    private String softwareName;      //软件名称
    private Integer status;           //App状态
    private String flatformId;          //所属平台
    private Integer categoryLevel1;   //一级分类
    private Integer categoryLevel2;   //二级分类
    private Integer categoryLevel3;   //三级分类

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFlatformId() {
        return flatformId;
    }

    public void setFlatformId(String flatformId) {
        this.flatformId = flatformId;
    }

    public Integer getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Integer categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public Integer getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(Integer categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public Integer getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(Integer categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }


}