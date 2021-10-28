package com.example.cherish.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.example.cherish.dao.StorageMapper;
import com.example.cherish.model.StorageInformation;
import com.example.cherish.service.StorageInterface;
import com.google.gson.Gson;

@Service
public class StorageServiceImpl implements StorageInterface {

    @Autowired
    private StorageMapper storageMapper;

    Gson gson = new Gson();

    public StorageInformation getStorageByName(String StorageName) {
        // TODO Auto-generated method stub
        JSONObject response = new JSONObject();
        StorageInformation storage = storageMapper.getStorageByName(StorageName);
        return storage;
    }

}
