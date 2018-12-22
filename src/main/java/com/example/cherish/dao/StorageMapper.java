package com.example.cherish.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StorageMapper {
	
    @Select("select id from t_file_block where name = 'name'" )
    int getStorageByName(String name);

}
