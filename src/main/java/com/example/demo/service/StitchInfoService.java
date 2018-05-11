package com.example.demo.service;

import com.example.demo.model.StitchInfo;

import java.util.List;

public interface StitchInfoService {

    List<StitchInfo> selectAll(Integer version);
}
