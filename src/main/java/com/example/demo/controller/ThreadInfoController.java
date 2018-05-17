package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.model.ThreadInfo;
import com.example.demo.service.ThreadInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("GuangXiu/ThreadInfo")
public class ThreadInfoController {

    @Resource
    private ThreadInfoService threadInfoService;


    @PostMapping("/thread")
    public RetResult<List<ThreadInfo>> selectAll(int version) {
            List<ThreadInfo> threadInfo = threadInfoService.selectAll(version);
            if(threadInfo!=null) {
                return RetResponse.makeOKRsp(threadInfo);
            }
        return RetResponse.makeRsp(300,"已是最新版");
    }
}
