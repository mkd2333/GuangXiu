package com.example.demo.service.impl;

import com.example.demo.dao.GraphicItemMapper;
import com.example.demo.model.ConfigInfo;
import com.example.demo.model.GraphicItem;
import com.example.demo.service.ConfigInfoService;
import com.example.demo.service.GraphicItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GraphicItemServiceImpl implements GraphicItemService {

    @Resource
    private GraphicItemMapper graphicItemMapper;


    @Override
    public List<GraphicItem> selectById( Integer id) {

            List<GraphicItem> list=graphicItemMapper.selectById(id);
            return list;
    }

    @Override
    public int coutById(Integer id) {
        int len = graphicItemMapper.countById(id);
        return len;
    }
}
