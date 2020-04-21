package com.one.service.impl;

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

    @Override
    public PageResult<QueryAppResult> queryApp(QueryBean queryBean,Integer page,Integer rows) {

        if (queryBean == null){
            return null;
        }
        //根据存在条件查询AppInfo
        List<AppInfo> appinfos = this.appDao.queryApp(queryBean);


        return null;

    }
}
