package com.one.controller;

import com.one.entity.PageResult;
import com.one.entity.QueryAppResult;
import com.one.entity.QueryBean;
import com.one.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("app")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("/find")
    public ResponseEntity<PageResult<QueryAppResult>> queryApp(
            @RequestBody QueryBean queryBean,
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows
    ){
        PageResult<QueryAppResult> result = this.appService.queryApp(queryBean,page,rows);
        /*if (result == null || CollectionUtils.isEmpty(result.getItems())){
            return ResponseEntity.notFound().build();
        }*/
        return ResponseEntity.ok(result);
    }
}
