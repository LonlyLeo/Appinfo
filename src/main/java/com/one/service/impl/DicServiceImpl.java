package com.one.service.impl;

import com.one.dao.DicDao;
import com.one.domain.DataDictionary;
import com.one.service.DicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicServiceImpl implements DicService {

    @Autowired
    private DicDao dicDao;

    @Override
    public List<DataDictionary> queryDic() {
        return this.dicDao.findAll();
    }
}
