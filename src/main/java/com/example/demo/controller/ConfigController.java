package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.model.ConfigInfo;
import com.example.demo.service.ConfigInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("GuangXiu/ConfigInfo")
public class ConfigController {

    @Resource
    private ConfigInfoService configInfoService;

    @GetMapping("/version")
    public RetResult<ConfigInfo> selectByVersion(){
        ConfigInfo version = configInfoService.getVersion();
        return RetResponse.makeOKRsp(version);
    }
}
