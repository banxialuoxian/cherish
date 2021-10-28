package com.example.cherish.service;

import org.springframework.stereotype.Component;

import com.example.cherish.model.StorageInformation;

@Component
public interface StorageInterface {

    public StorageInformation getStorageByName(String StorageName);

}
