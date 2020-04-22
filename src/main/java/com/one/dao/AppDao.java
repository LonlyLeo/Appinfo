package com.one.dao;

import com.github.pagehelper.Page;
import com.one.domain.AppInfo;
import com.one.entity.QueryBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppDao {

    /**
     * 通过query查询AppInfo
     * @param queryBean
     * @return
     */
    List<AppInfo> queryApp(QueryBean queryBean);

    @Select("select * from app_info")
    Page<AppInfo> findAll();
}
