package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.PhaseInfoMapper;
import com.example.demo.model.PhaseInfo;
import com.example.demo.service.PhaseInfoService;
import com.example.demo.util.JudgeVersion;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PhaseInfoServiceImpl implements PhaseInfoService {

    @Resource
    private PhaseInfoMapper phaseInfoMapper;

    @Resource
    private JudgeVersion judgeVersion;

    @Override
    public List<PhaseInfo> selectById(Integer version) {
        if(judgeVersion.isNew(version)) {
            List<PhaseInfo> phaseInfo = phaseInfoMapper.selectAll();
            return phaseInfo;
        }
        return null;
    }
}