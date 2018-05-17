package com.example.demo.service.impl;

import com.example.demo.dao.MasterDescMapper;
import com.example.demo.dao.MasterInfoMapper;
import com.example.demo.dao.MasterWorksMapper;
import com.example.demo.model.ConfigInfo;
import com.example.demo.model.MasterDesc;
import com.example.demo.model.MasterInfo;
import com.example.demo.model.MasterWorks;
import com.example.demo.service.ConfigInfoService;
import com.example.demo.service.MasterInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MasterInfoServiceImpl implements MasterInfoService {

    @Resource
    private MasterWorksMapper masterWorksMapper;
    @Resource
    private MasterDescMapper masterDescMapper;
    @Resource
    private ConfigInfoService configInfoService;

    @Override
    public List<MasterDesc> selectMaster(Integer version) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_master();
        if(version!=newVersion) {
            List<MasterDesc> masterInfo =masterDescMapper.selectMaster();
            return masterInfo;
        }
       return null;
    }

    @Override
    public List<MasterWorks> selectByAuthor(Integer version, Integer author) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_masterwork();
        if(version!=newVersion) {
            List<MasterWorks> masterWorks = masterWorksMapper.selectByAuthor(author);
            return masterWorks;
        }
        return null;
    }

    @Override
    public List<MasterWorks> selectAll2(Integer version) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_masterwork();
        if(version!=newVersion) {
            List<MasterWorks> masterWorks = masterWorksMapper.selectAll();
            return masterWorks;
        }
        return null;
    }

    @Override
    public List<MasterWorks> selectByType(Integer version, Integer type) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_masterwork();
        if(version!=newVersion) {
            List<MasterWorks> masterWorks = masterWorksMapper.selectByType(type);
            return masterWorks;
        }
        return null;
    }


    @Override
    public MasterDesc selectById2(Integer version, Integer id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_master();
        if(version!=newVersion)
            {
                MasterDesc masterDescs = masterDescMapper.selectById(id);
                return masterDescs;
            }
            return null;
    }
}
