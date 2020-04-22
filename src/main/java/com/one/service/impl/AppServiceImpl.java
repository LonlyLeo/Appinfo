package com.one.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.dao.AppDao;
import com.one.domain.AppInfo;
import com.one.entity.PageResult;
import com.one.entity.QueryAppResult;
import com.one.entity.QueryBean;
import com.one.service.AppService;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private AppDao appDao;

    /**
     * 通过QueryBean查询分页结果集
     * @param queryBean
     * @param page
     * @param rows
     * @return
     */
    @Override
    public PageResult<AppInfo> queryApp(QueryBean queryBean,Integer page,Integer rows) {

        /*if (queryBean == null){
            return null;
        }*/
        //添加分页
        PageHelper.startPage(page,rows);
        //根据存在条件查询AppInfo
        List<AppInfo> appinfos = this.appDao.queryApp(queryBean);
        //包装分页记录
        PageInfo pageInfo = new PageInfo(appinfos);

        return new PageResult<>(pageInfo.getTotal(),pageInfo.getPages(),pageInfo.getList());

    }
}
