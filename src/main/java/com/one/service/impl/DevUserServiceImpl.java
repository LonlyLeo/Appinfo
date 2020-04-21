package com.one.service.impl;

import com.one.bo.DevUserBo;
import com.one.dao.DevUserDao;
import com.one.domain.DevUser;
import com.one.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevUserServiceImpl implements DevUserService {

    @Autowired
    private DevUserDao devUserDao;

    /**
     * 检测登录
     * 验证成功返回当前用户的信息
     * 验证失败返回null
     * @param devUser
     * @return
     */
    @Override
    public DevUser checkLogin(DevUser devUser) {
        if (devUser == null){
            return null;
        }
        DevUser user = this.devUserDao.findByDevCode(devUser.getDevCode());
        if (user.getDevPassword().equals(devUser.getDevPassword())){
            return user;
        }
        return null;
    }




}
