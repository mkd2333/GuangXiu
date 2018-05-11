package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.StitchInfo;
import com.example.demo.service.StitchInfoService;
import com.example.demo.util.JudgeVersion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("GuangXiu/StitchInfo")
public class StitchInfoController {

    @Resource
    private StitchInfoService stitchInfoService;


    @PostMapping("/stitch")
    public RetResult<List<StitchInfo>> selectAll(int version){
            List<StitchInfo> stitchInfo = stitchInfoService.selectAll(version);
            if(stitchInfo!=null) {
                return RetResponse.makeOKRsp(stitchInfo);
            }
        return RetResponse.makeRsp(300,"已是最新版");
        }

}
