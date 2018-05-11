package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.StitchInfoMapper;
import com.example.demo.model.StitchInfo;
import com.example.demo.service.StitchInfoService;
import com.example.demo.util.JudgeVersion;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StitchInfoServiceImpl implements StitchInfoService {

    @Resource
    private StitchInfoMapper stitchInfoMapper;
   @Resource
    private JudgeVersion judgeVersion;

    @Override
    public List<StitchInfo> selectAll(Integer version) {
        if(judgeVersion.isNew(version)) {
            List<StitchInfo> stitchInfo = stitchInfoMapper.selectAll();
            return stitchInfo;
        }
        return null;
    }
}
