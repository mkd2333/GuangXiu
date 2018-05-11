package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.GraphicItem;
import com.example.demo.service.GraphicItemService;
import com.example.demo.util.JudgeVersion;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("GuangXiu/GraphicItem")
public class GraphicItemController {

    @Resource
    private GraphicItemService graphicItemService;


    @PostMapping("/*")
    public RetResult<Map<String, Object>> selectById(int version, int id) {
        Map<String, Object> mp = new HashMap<String, Object>();
         List<GraphicItem> list = graphicItemService.selectById(version,id);
         if(list!=null) {
             int len = graphicItemService.coutById(id);
             mp.put("len", len);
             mp.put("item", list);
             return RetResponse.makeOKRsp(mp);
         }
        return RetResponse.makeRsp(300,"已是最新版");
        }
    }

