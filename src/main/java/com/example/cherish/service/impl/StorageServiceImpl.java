package com.example.cherish.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cherish.dao.StorageMapper;
import com.example.cherish.service.StorageInterface;

@Service
public class StorageServiceImpl implements StorageInterface {

	@Autowired
	private StorageMapper storageMapper;

	public String getStorageByName(String StorageName) {
		// TODO Auto-generated method stub
		int id = storageMapper.getStorageByName(StorageName);
		return null;
	}

}
