package com.example.cherish.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.cherish.model.StorageInformation;

@Mapper
public interface StorageMapper {

    @Select("select * from t_file_block as a INNER JOIN t_space_block as b where file_name = #{StorageName} and a.space_id = b.id")
    StorageInformation getStorageByName(@Param("StorageName") String StorageName);

    @Select("select * from t_file_block as a INNER JOIN t_space_block as b where file_name = #{StorageName} and a.space_id = b.id")
    String getFiledByName(@Param("StorageName") String StorageName);
}