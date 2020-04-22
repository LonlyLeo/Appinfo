package com.one.dao;

import com.one.domain.DevUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface DevUserDao {

    /**
     * 通过devCode查询Dev_user
     * @param devCode
     * @return
     */
    @Select("select * from dev_user where devCode = #{devCode}")
    DevUser findByDevCode(String devCode);
}
