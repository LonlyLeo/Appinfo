package com.one.controller;

import com.one.bo.DevUserBo;
import com.one.domain.DevUser;
import com.one.entity.Result;
import com.one.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class DevUserController {

    @Autowired
    private DevUserService devUserService;

    /**
     * 开发用户登录
     * @param devUser
     * @param request
     * @return
     */
    @PostMapping("login")
    public ResponseEntity<Result> login(@RequestBody DevUser devUser, HttpServletRequest request) {

        DevUser devUser1 = this.devUserService.checkLogin(devUser);

        if (devUser1 == null) {
            return ResponseEntity.ok(new Result(false, "账户名或者密码错误！"));
        }
        HttpSession session = request.getSession();
        //存入sessionId
        DevUserBo devUserBo = new DevUserBo();
        devUserBo.setDevUser(devUser1);
        devUserBo.setSessionId(session.getId());
        session.setAttribute(session.getId(),devUserBo);
        //返回数据
        return ResponseEntity.ok(new Result(true,null,devUserBo));
    }

}
