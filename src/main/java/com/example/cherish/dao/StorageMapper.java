package com.example.cherish.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StorageMapper {
	
    @Select("select id from t_file_block where name = #{StorageName}" )
    int getStorageByName(@Param("StorageName") String StorageName);

}
