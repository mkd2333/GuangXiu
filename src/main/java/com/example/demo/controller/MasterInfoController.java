package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.model.MasterDesc;
import com.example.demo.model.MasterInfo;
import com.example.demo.model.MasterWorks;
import com.example.demo.service.MasterInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("GuangXiu/MasterInfo")
public class  MasterInfoController {

    @Resource
    private MasterInfoService masterInfoService;


    @PostMapping("/master")
    public RetResult<List<MasterDesc>> selectAll(int version){

        List<MasterDesc> masters = masterInfoService.selectMaster(version);
        if(masters!=null) {
            return RetResponse.makeOKRsp(masters);
        }
        return RetResponse.makeRsp(300,"已是最新版");
    }


    @PostMapping("/work")
    public RetResult<List<MasterWorks>> selectById(int version,int type) {
             if(type==0){
                 List<MasterWorks> masterWorks1 = masterInfoService.selectAll2(version);
                 if(masterWorks1!=null) {
                     return RetResponse.makeOKRsp(masterWorks1);
                 }
                 return RetResponse.makeRsp(300,"已是最新版");
             }
             else {
                 List<MasterWorks> masterWorks = masterInfoService.selectByType(version, type);
                 if (masterWorks != null) {
                     return RetResponse.makeOKRsp(masterWorks);
                 }
                 return RetResponse.makeRsp(300,"已是最新版");
             }

    }
    @PostMapping("/desc")
      public RetResult<Map<String, Object>> selectById2(int version, int id) {
          MasterDesc masterDescs = masterInfoService.selectById2(version,id);
          List<MasterWorks> masterWorks = masterInfoService.selectByAuthor(version,id);
          if(masterDescs!=null) {
              Map<String, Object> mp = new HashMap<String, Object>();
              mp.put("desc",masterDescs);
              mp.put("work",masterWorks);
              return RetResponse.makeOKRsp(mp);
          }
          return RetResponse.makeRsp(300,"已是最新版");
      }


}
