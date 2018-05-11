package com.example.demo.service;

import com.example.demo.model.MasterInfo;
import com.example.demo.model.MasterWorks;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MasterInfoService {

    List<MasterInfo> selectAll(Integer version);

    List<MasterWorks> selectById(Integer version,Integer id);
}


