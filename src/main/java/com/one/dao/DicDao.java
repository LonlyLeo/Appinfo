package com.one.dao;

import com.one.domain.DataDictionary;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DicDao {

    @Select("select * from data_dictionary")
    List<DataDictionary> findAll();
}
