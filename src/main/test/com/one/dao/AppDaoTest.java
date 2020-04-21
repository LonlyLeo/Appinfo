package com.one.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.one.domain.AppInfo;
import com.one.entity.QueryBean;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AppDaoTest {

    @Autowired
    private AppDao appDao;

    @Test
    public void testFindAll(){
        PageHelper.startPage(1,5);
        Page<AppInfo> all = appDao.findAll();
        List<AppInfo> result = all.getResult();
        for (AppInfo appInfo : result) {
            System.out.println(appInfo);
        }
    }

    @Test
    public void testQueryApp(){
        QueryBean queryBean = new QueryBean();
        queryBean.setSoftwareName("饥荒");
        queryBean.setStatus(5);
        List<AppInfo> appinfos = this.appDao.queryApp(queryBean);
        for (AppInfo appinfo : appinfos) {
            System.out.println(appinfo);
        }
    }
}