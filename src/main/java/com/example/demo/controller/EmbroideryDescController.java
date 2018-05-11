package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.model.EmbroideryDesc;
import com.example.demo.service.EmbroideryDescService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("GuangXiu/EmbroideryDesc")
public class EmbroideryDescController {

    @Resource
    private EmbroideryDescService embroideryDescService;

    @PostMapping("/desc")
    public RetResult<EmbroideryDesc> getDesc(int version){
        EmbroideryDesc embroideryDesc = embroideryDescService.getDesc(version);
        if(embroideryDesc!=null) {
            return RetResponse.makeOKRsp(embroideryDesc);
        }
        return RetResponse.makeRsp(300,"已是最新版");
    }
}
