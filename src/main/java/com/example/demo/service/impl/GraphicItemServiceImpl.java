package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.GraphicItemMapper;
import com.example.demo.model.GraphicItem;
import com.example.demo.service.GraphicItemService;
import com.example.demo.util.JudgeVersion;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.rmi.server.ServerCloneException;
import java.util.ArrayList;
import java.util.List;

@Service
public class GraphicItemServiceImpl implements GraphicItemService {

    @Resource
    private GraphicItemMapper graphicItemMapper;
    @Resource
    private JudgeVersion judgeVersion;

    @Override
    public List<GraphicItem> selectById(Integer version, Integer id) {
        if (judgeVersion.isNew(version)) {
            List<GraphicItem> list=graphicItemMapper.selectById(id);
            return list;
        }
        return null;
    }

    @Override
    public int coutById(Integer id) {
        int len = graphicItemMapper.countById(id);
        return len;
    }
}
