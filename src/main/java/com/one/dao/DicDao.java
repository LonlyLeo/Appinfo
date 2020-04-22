package com.one.dao;

import com.one.domain.DataDictionary;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DicDao {

    /**
     * 查询数据字典
     * @return
     */
    @Select("select * from data_dictionary")
    List<DataDictionary> findAll();
}
