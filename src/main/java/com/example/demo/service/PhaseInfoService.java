package com.example.demo.service;

import com.example.demo.model.PhaseInfo;

import java.util.List;

public interface PhaseInfoService {

    List<PhaseInfo> selectById(Integer version);

}
