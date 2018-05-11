package com.example.demo.dao;

import com.example.demo.model.GraphicItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GraphicItemMapper {

    List<GraphicItem> selectById(@Param("id") Integer id);

    int countById(@Param("id") Integer id);
}
