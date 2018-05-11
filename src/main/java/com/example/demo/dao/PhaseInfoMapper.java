package com.example.demo.dao;

import com.example.demo.model.PhaseInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhaseInfoMapper {

    List<PhaseInfo> selectAll();
}
