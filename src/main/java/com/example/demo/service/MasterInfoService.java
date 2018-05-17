package com.example.demo.service;

import com.example.demo.model.MasterDesc;
import com.example.demo.model.MasterInfo;
import com.example.demo.model.MasterWorks;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MasterInfoService {

    List<MasterDesc> selectMaster(Integer version);

    List<MasterWorks> selectByAuthor(Integer version,Integer author);

    List<MasterWorks> selectAll2(Integer version);

    List<MasterWorks> selectByType(Integer version,Integer type);

    MasterDesc selectById2(Integer version, Integer id);
}


