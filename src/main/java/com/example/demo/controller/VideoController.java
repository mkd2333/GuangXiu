package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.model.Video;
import com.example.demo.service.VideoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("GuangXiu/Teaching")
public class VideoController {

    @Resource
    private VideoService videoService;

    @PostMapping("/video")
    public RetResult<List<Video>> selectByType(int version,int type){
        if (type == 0) {
            List<Video> videos1 = videoService.selectAll(version);
            if (videos1!=null) {
                return RetResponse.makeOKRsp(videos1);
            }
            return RetResponse.makeRsp(300,"已是最新版");
        }
        else{
            List<Video> videos = videoService.selectByType(version,type);
            if (videos!=null) {
                return RetResponse.makeOKRsp(videos);
            }
            return RetResponse.makeRsp(300,"已是最新版");
        }

    }
}
