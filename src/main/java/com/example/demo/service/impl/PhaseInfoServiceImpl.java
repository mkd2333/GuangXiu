package com.example.demo.service.impl;

import com.example.demo.dao.PhaseInfoMapper;
import com.example.demo.model.ConfigInfo;
import com.example.demo.model.PhaseInfo;
import com.example.demo.service.ConfigInfoService;
import com.example.demo.service.PhaseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PhaseInfoServiceImpl implements PhaseInfoService {

    @Resource
    private PhaseInfoMapper phaseInfoMapper;

    @Resource
    private ConfigInfoService configInfoService;

    @Override
    public List<PhaseInfo> selectById(Integer version) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_phase();
        if(version!=newVersion) {
            List<PhaseInfo> phaseInfo = phaseInfoMapper.selectAll();
            return phaseInfo;
        }
        return null;
    }
}