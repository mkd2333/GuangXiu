package com.example.demo.dao;

import com.example.demo.model.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoMapper {
    List<Video> selectByType(@Param("type") Integer type);

    List<Video> selectAll();
}
