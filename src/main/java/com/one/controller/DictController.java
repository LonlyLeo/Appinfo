package com.one.controller;

import com.one.domain.DataDictionary;
import com.one.service.DicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DictController {

    @Autowired
    private DicService dicService;

    /**
     * 返回字典所有数据
     * @return
     */
    @RequestMapping("findDic")
    public ResponseEntity<List<DataDictionary>> queryDic(){
        List<DataDictionary> dataDictionaries = this.dicService.queryDic();
        if (CollectionUtils.isEmpty(dataDictionaries)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dataDictionaries);
    }
}
