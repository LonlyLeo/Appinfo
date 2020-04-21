package com.one.dao;

import com.one.domain.DevUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DevUserDaoTest {

    @Autowired
    private DevUserDao devUserDao;
    @Test
    public void findByDevCodeTest(){
        DevUser devUser = this.devUserDao.findByDevCode("test001");
        System.out.println(devUser);
    }
}