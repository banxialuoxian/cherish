package com.example.cherish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cherish.model.StorageInformation;
import com.example.cherish.service.StorageInterface;
import com.google.gson.Gson;

@RestController
@RequestMapping("v1/storage")
public class StorageController {

    @Autowired
    private StorageInterface storageInterface;

    @RequestMapping("/getStorageByName")
    public StorageInformation getStorageByName(String StorageName) {
        StorageInformation storageInformation;
        storageInformation = storageInterface.getStorageByName(StorageName);

        return storageInformation;

    }

}
