package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.MasterInfo;
import com.example.demo.model.MasterWorks;
import com.example.demo.service.MasterInfoService;
import com.example.demo.util.JudgeVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("GuangXiu/MasterInfo")
public class MasterInfoController {

    @Resource
    private MasterInfoService masterInfoService;


    @PostMapping("/master")
    public RetResult<List<MasterInfo>> selectAll(int version){

            List<MasterInfo> masterInfo = masterInfoService.selectAll(version);
            if(masterInfo!=null) {
                return RetResponse.makeOKRsp(masterInfo);
            }
        return RetResponse.makeRsp(300,"已是最新版");

    }
    @PostMapping("/production")
    public RetResult<List<MasterWorks>> selectById(int version,int id) {

            List<MasterWorks> masterWorks = masterInfoService.selectById(version,id);
            if(masterWorks!=null) {
                return RetResponse.makeOKRsp(masterWorks);
            }
        return RetResponse.makeRsp(300,"已是最新版");
    }

}
