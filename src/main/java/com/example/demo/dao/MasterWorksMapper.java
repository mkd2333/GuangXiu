package com.example.demo.dao;


import com.example.demo.model.MasterWorks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MasterWorksMapper {

    List<MasterWorks> selectByAuthor(@Param("author") Integer author);

    List<MasterWorks> selectByType(@Param("type") Integer type);

    List<MasterWorks> selectAll();

}
