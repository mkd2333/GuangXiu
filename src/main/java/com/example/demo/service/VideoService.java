package com.example.demo.service;

import com.example.demo.model.Video;

import java.util.List;

public interface VideoService {

    List<Video> selectByType(Integer version,Integer type);

    List<Video> selectAll(Integer version);

}
