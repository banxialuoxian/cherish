package com.example.cherish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cherish.service.StorageInterface;

@RestController
@RequestMapping("v1/storage")
public class StorageController {

	@Autowired
	private StorageInterface storageInterface;

	@RequestMapping("/getStorageByName")
	public String getStorageByName(String StorageName) {
		String storageInformation;
		storageInformation = storageInterface.getStorageByName(StorageName);
		return storageInformation;

	}

}
