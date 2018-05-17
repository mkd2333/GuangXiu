package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.model.ConfigInfo;
import com.example.demo.model.GraphicItem;
import com.example.demo.service.ConfigInfoService;
import com.example.demo.service.GraphicItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("GuangXiu")
public class GraphicItemController {

    @Resource
    private GraphicItemService graphicItemService;
    @Resource
    private ConfigInfoService configInfoService;


    @PostMapping("/Arts/features")
    public RetResult<Map<String, Object>> selectArts(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_art();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);

                int len = graphicItemService.coutById(id);
                mp.put("len", len);
                mp.put("item", list);
                return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
        }

    @PostMapping("/Material/pergola")
    public RetResult<Map<String, Object>> selectPergola(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_pergola();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);
                int len = graphicItemService.coutById(id);
                mp.put("len", len);
                mp.put("item", list);
                return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
    }
@PostMapping("/Material/needle")
    public RetResult<Map<String, Object>> selectNeedle(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_needle();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);
            int len = graphicItemService.coutById(id);
            mp.put("len", len);
            mp.put("item", list);
            return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
    }
    @PostMapping("/Stitch/item")
    public RetResult<Map<String, Object>> selectStitch(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_stitch();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);
            int len = graphicItemService.coutById(id);
            mp.put("len", len);
            mp.put("item", list);
            return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
    }
    @PostMapping("/Thread/item")
    public RetResult<Map<String, Object>> selectThread(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_thread();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);
            int len = graphicItemService.coutById(id);
            mp.put("len", len);
            mp.put("item", list);
            return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
    }

    @PostMapping("/Embroider/item")
    public RetResult<Map<String, Object>> selectEmbroider(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_embroidery();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);
            int len = graphicItemService.coutById(id);
            mp.put("len", len);
            mp.put("item", list);
            return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
    }
    @PostMapping("/Phases/item")
    public RetResult<Map<String, Object>> selectPhases(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_phase();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);
            int len = graphicItemService.coutById(id);
            mp.put("len", len);
            mp.put("item", list);
            return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
    }

    @PostMapping("/Meaning")
    public RetResult<Map<String, Object>> selectMeanning(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_meanning();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);
            int len = graphicItemService.coutById(id);
            mp.put("len", len);
            mp.put("item", list);
            return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
    }

    @PostMapping("/Development")
    public RetResult<Map<String, Object>> selectDevelop(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_development();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);
            int len = graphicItemService.coutById(id);
            mp.put("len", len);
            mp.put("item", list);
            return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
    }
    @PostMapping("/Origin")
    public RetResult<Map<String, Object>> selectOrigin(int version, int id) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_origin();
        if(version!=newVersion) {
            Map<String, Object> mp = new HashMap<String, Object>();
            List<GraphicItem> list = graphicItemService.selectById(id);
            int len = graphicItemService.coutById(id);
            mp.put("len", len);
            mp.put("item", list);
            return RetResponse.makeOKRsp(mp);

        }
        return RetResponse.makeRsp(300,"已是最新版");
    }
}

