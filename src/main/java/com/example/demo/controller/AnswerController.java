package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.model.Answer;
import com.example.demo.service.AnswerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("GuangXiu/Answering")
public class AnswerController {
    @Resource
    private AnswerService answerService;

      @PostMapping("/answer")
     public RetResult<List<Answer>> selectAll(int version){
         List<Answer> answers =answerService.selectAll(version);
         if(answers!=null)
         {
             return RetResponse.makeOKRsp(answers);
         }
         return RetResponse.makeRsp(300,"已是最新版");
     }
}
