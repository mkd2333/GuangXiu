package com.example.demo.service.impl;

import com.example.demo.dao.StitchInfoMapper;
import com.example.demo.model.ConfigInfo;
import com.example.demo.model.StitchInfo;
import com.example.demo.service.ConfigInfoService;
import com.example.demo.service.StitchInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StitchInfoServiceImpl implements StitchInfoService {

    @Resource
    private StitchInfoMapper stitchInfoMapper;
    @Resource
    private ConfigInfoService configInfoService;

    @Override
    public List<StitchInfo> selectAll(Integer version) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_stitch();
        if(version!=newVersion) {
            List<StitchInfo> stitchInfo = stitchInfoMapper.selectAll();
            return stitchInfo;
        }
        return null;
    }
}
