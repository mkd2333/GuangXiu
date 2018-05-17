package com.example.demo.service.impl;

import com.example.demo.dao.EmbroideryDescMapper;
import com.example.demo.model.ConfigInfo;
import com.example.demo.model.EmbroideryDesc;
import com.example.demo.service.ConfigInfoService;
import com.example.demo.service.EmbroideryDescService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmbroideryDescServiceImpl implements EmbroideryDescService {

    @Resource
    private EmbroideryDescMapper embroideryDescMapper;
    @Resource
    private ConfigInfoService configInfoService;

     public EmbroideryDesc getDesc(Integer version) {

         ConfigInfo configInfo = configInfoService.getVersion();
         int newVersion = configInfo.getVer_desc();
        if (version!=newVersion) {
            EmbroideryDesc embroideryDesc = embroideryDescMapper.getDesc();
            return embroideryDesc;
        }
        return null;
    }

}
