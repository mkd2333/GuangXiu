package com.example.demo.service.impl;

import com.example.demo.dao.VideoMapper;
import com.example.demo.model.ConfigInfo;
import com.example.demo.model.Video;
import com.example.demo.service.ConfigInfoService;
import com.example.demo.service.VideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Resource
    private VideoMapper videoMapper;
    @Resource
    private ConfigInfoService configInfoService;
    @Override
    public List<Video> selectByType(Integer version, Integer type) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_video();
        if(version!=newVersion) {
            List<Video> videos = videoMapper.selectByType(type);
            return videos;
        }
        return null;
    }

    @Override
    public List<Video> selectAll(Integer version) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_video();
        if(version!=newVersion) {
            List<Video> videos = videoMapper.selectAll();
            return videos;
        }
        return null;
    }
}
