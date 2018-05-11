package com.example.demo.dao;


import com.example.demo.model.MasterWorks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MasterWorksMapper {

    List<MasterWorks> selectById(@Param("id") Integer id);
}
