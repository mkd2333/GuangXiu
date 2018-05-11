package com.example.demo.service.impl;

import com.example.demo.dao.EmbroideryDescMapper;
import com.example.demo.model.EmbroideryDesc;
import com.example.demo.service.EmbroideryDescService;
import com.example.demo.util.JudgeVersion;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmbroideryDescServiceImpl implements EmbroideryDescService {

    @Resource
    private EmbroideryDescMapper embroideryDescMapper;

    @Resource
    private JudgeVersion judgeVersion;

    public EmbroideryDesc getDesc(Integer version) {
        if (judgeVersion.isNew(version)) {
            EmbroideryDesc embroideryDesc = embroideryDescMapper.getDesc();
            return embroideryDesc;
        }
        return null;
    }

}
