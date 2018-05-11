package com.example.demo.service;

import com.example.demo.model.ThreadInfo;

import java.util.List;

public interface ThreadInfoService {

    List<ThreadInfo> selectAll(Integer version);
}
