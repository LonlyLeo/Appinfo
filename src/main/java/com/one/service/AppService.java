package com.one.service;

import com.one.entity.PageResult;
import com.one.entity.QueryAppResult;
import com.one.entity.QueryBean;

public interface AppService {

    PageResult<QueryAppResult> queryApp(QueryBean queryBean,Integer page,Integer rows);
}
