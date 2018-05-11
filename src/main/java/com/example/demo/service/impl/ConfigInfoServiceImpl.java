package com.example.demo.service.impl;

import com.example.demo.dao.ConfigInfoMapper;
import com.example.demo.service.ConfigInfoService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Primary
public class ConfigInfoServiceImpl implements ConfigInfoService {

    @Resource
    private ConfigInfoMapper configInfoMapper;

    public int getVersion()
    {
      int version = configInfoMapper.getVersion();
        return version;

    }

}
