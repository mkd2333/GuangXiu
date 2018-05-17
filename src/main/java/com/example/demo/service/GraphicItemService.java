package com.example.demo.service;

import com.example.demo.model.GraphicItem;

import java.util.List;

public interface GraphicItemService {

    List<GraphicItem> selectById( Integer id);
    int coutById(Integer id);
}
