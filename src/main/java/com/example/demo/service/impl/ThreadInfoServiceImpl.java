package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.ThreadInfoMapper;
import com.example.demo.model.ThreadInfo;
import com.example.demo.service.ThreadInfoService;
import com.example.demo.util.JudgeVersion;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.soap.Addressing;
import java.util.List;

@Service
public class ThreadInfoServiceImpl implements ThreadInfoService {

    @Resource
    private ThreadInfoMapper threadInfoMapper;

    @Resource
    private JudgeVersion judgeVersion;
    @Override
    public List<ThreadInfo> selectAll(Integer version) {
        if(judgeVersion.isNew(version)) {
            List<ThreadInfo> threadInfo = threadInfoMapper.selectAll();
            return threadInfo;
        }
       return null;
    }
}
