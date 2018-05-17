package com.example.demo.dao;

import com.example.demo.model.MasterDesc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MasterDescMapper {

    MasterDesc selectById(@Param("id") Integer id);

    List<MasterDesc> selectMaster();
}
