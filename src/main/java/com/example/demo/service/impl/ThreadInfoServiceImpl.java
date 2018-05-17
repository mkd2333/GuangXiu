package com.example.demo.service.impl;

import com.example.demo.dao.ThreadInfoMapper;
import com.example.demo.model.ConfigInfo;
import com.example.demo.model.ThreadInfo;
import com.example.demo.service.ConfigInfoService;
import com.example.demo.service.ThreadInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ThreadInfoServiceImpl implements ThreadInfoService {

    @Resource
    private ThreadInfoMapper threadInfoMapper;
    @Resource
    private ConfigInfoService configInfoService;

    @Override
    public List<ThreadInfo> selectAll(Integer version) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_thread();
        if(version!=newVersion) {
            List<ThreadInfo> threadInfo = threadInfoMapper.selectAll();
            return threadInfo;
        }
       return null;
    }
}
