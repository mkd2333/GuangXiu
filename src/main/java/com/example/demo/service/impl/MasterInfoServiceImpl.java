package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.MasterInfoMapper;
import com.example.demo.dao.MasterWorksMapper;
import com.example.demo.model.MasterInfo;
import com.example.demo.model.MasterWorks;
import com.example.demo.service.MasterInfoService;
import com.example.demo.util.JudgeVersion;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MasterInfoServiceImpl implements MasterInfoService {
    @Resource
    private MasterInfoMapper masterInfoMapper;
    @Resource
    private MasterWorksMapper masterWorksMapper;
     @Resource
    private JudgeVersion judgeVersion;

    @Override
    public List<MasterInfo> selectAll(Integer version) {
        if(judgeVersion.isNew(version)) {
            List<MasterInfo> masterInfo = masterInfoMapper.selectAll();
            return masterInfo;
        }
       return null;
    }

    @Override
    public List<MasterWorks> selectById(Integer version,Integer id) {
        if(judgeVersion.isNew(version)) {
            List<MasterWorks> masterWorks = masterWorksMapper.selectById(id);
            return masterWorks;
        }
        return null;
    }
}
