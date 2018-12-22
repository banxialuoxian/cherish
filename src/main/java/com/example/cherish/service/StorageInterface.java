package com.example.cherish.service;

import org.springframework.stereotype.Component;

@Component
public interface StorageInterface {
	
	public String getStorageByName(String StorageName);

}
