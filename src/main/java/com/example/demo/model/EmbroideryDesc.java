package com.example.demo.model;

import com.example.demo.dao.ConfigInfoMapper;
import com.example.demo.service.ConfigInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

public class EmbroideryDesc {

    /*主键*/
    private int des_id;

    private String des;

    private String background;

    public int getDesc_id() {
        return des_id;
    }

    public void setDesc_id(int des_id) {
        this.des_id = des_id;
    }

    public String getDesc() {
        return des;
    }

    public void setDesc(String desc) {
        this.des = desc;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Service
    public static class ConfigInfoServiceImpl implements ConfigInfoService {

        @Resource
        private ConfigInfoMapper configInfoMapper;

        public int getVersion()
        {
          int version = configInfoMapper.getVersion();
            return version;

        }

    }
}
