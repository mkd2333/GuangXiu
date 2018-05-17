package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.model.PhaseInfo;
import com.example.demo.service.PhaseInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("GuangXiu/PhaseInfo")
public class PhaseInfoController {

    @Resource
    private PhaseInfoService phaseInfoService;


    @PostMapping("/phases")
    public RetResult<List<PhaseInfo>> selectAll(int version){
            List<PhaseInfo> phaseInfo = phaseInfoService.selectById(version);
            if(phaseInfo!=null) {
                return RetResponse.makeOKRsp(phaseInfo);
            }
        return RetResponse.makeRsp(300,"已是最新版");
    }

}
