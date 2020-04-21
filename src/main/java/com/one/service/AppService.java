package com.one.service;

import com.one.domain.AppInfo;
import com.one.entity.PageResult;
import com.one.entity.QueryAppResult;
import com.one.entity.QueryBean;

public interface AppService {

    PageResult<AppInfo> queryApp(QueryBean queryBean, Integer page, Integer rows);
}
