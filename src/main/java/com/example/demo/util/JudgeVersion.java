package com.example.demo.util;

import com.example.demo.dao.ConfigInfoMapper;
import com.example.demo.model.ConfigInfo;
import com.example.demo.service.ConfigInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class JudgeVersion {

    private int serviceVersion;

    @Resource
    private ConfigInfoMapper configInfoMapper;

    public boolean isNew(int version){
        serviceVersion = configInfoMapper.getVersion();
        if(version==serviceVersion){
            return false;
        }
        return true;
    }

}
