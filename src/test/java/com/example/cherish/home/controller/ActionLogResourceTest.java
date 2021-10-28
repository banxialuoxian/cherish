package com.example.cherish.home.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import com.example.cherish.common.BaseTestCase;
import com.example.cherish.dao.StorageMapper;
import com.example.cherish.model.StorageInformation;
import com.example.cherish.service.StorageInterface;
import com.example.cherish.service.impl.StorageServiceImpl;

import junit.framework.Assert;

public class ActionLogResourceTest extends BaseTestCase {
    @InjectMocks
    private StorageInterface storageInterface = new StorageServiceImpl();
    @Mock
    private StorageMapper storageMapper;

    @Before
    public void setUp() throws Exception {
        // 初始化测试用例类中由Mockito的注解标注的所有模拟对象
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createActionLog() {


        StorageInformation bean = new StorageInformation();
//		mockMvc.perform(get("/v1/storage/getStorageByName")).and
        Mockito.when(storageMapper.getFiledByName("1")).thenReturn("1");
        Assert.assertEquals(1, bean.getFile_id());

//		StorageInformation f = new StorageInformation();
//        f.setFile_id(1);
//        String id = "1";
//        Mockito.when(storageMapper.getStorageByName(id)).thenReturn(f);
//        StorageInformation returnF = storageInterface.getStorageByName(id);
//        Mockito.verify(storageMapper).getStorageByName(id);
//        System.out.print(f);
//        Assert.assertEquals(f.getFile_id(), returnF.getFile_id());


    }

}
