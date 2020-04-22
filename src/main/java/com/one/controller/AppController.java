package com.one.controller;

import com.one.domain.AppInfo;
import com.one.entity.PageResult;
import com.one.entity.QueryAppResult;
import com.one.entity.QueryBean;
import com.one.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("app")
public class AppController {

    @Autowired
    private AppService appService;

    /**
     * 根据存在的条件查询apps
     * @param queryBean
     * @param page
     * @param rows
     * @return
     */
    @PostMapping("/find")
    public ResponseEntity<PageResult<AppInfo>> queryApp(
            @RequestBody QueryBean queryBean,
            @RequestParam(value = "page", defaultValue = "1",required = true) Integer page,
            @RequestParam(value = "rows", defaultValue = "5",required = true) Integer rows
    ){
        PageResult<AppInfo> result = this.appService.queryApp(queryBean,page,rows);
        return ResponseEntity.ok(result);
    }


}
