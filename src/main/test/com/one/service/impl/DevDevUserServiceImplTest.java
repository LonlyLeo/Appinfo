package com.one.service.impl;

import com.one.domain.DevUser;
import com.one.service.DevUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DevDevUserServiceImplTest {

    @Autowired
    private DevUserService service;
    @Test
    public void loginTest(){
        DevUser devUser = new DevUser();
        devUser.setDevCode("test001");
        devUser.setDevPassword("123456");
        DevUser devUser1 = service.checkLogin(devUser);
        System.out.println(devUser1);

    }
}