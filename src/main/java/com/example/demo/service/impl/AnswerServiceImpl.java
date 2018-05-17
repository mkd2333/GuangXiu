package com.example.demo.service.impl;

import com.example.demo.dao.AnswerMapper;
import com.example.demo.model.Answer;
import com.example.demo.model.ConfigInfo;
import com.example.demo.service.AnswerService;
import com.example.demo.service.ConfigInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

     @Resource
    private AnswerMapper answerMapper;
     @Resource
     private ConfigInfoService configInfoService;

    @Override
    public List<Answer> selectAll(Integer version) {
        ConfigInfo configInfo = configInfoService.getVersion();
        int newVersion = configInfo.getVer_answer();
        if(version!=newVersion) {
            List<Answer> answers = answerMapper.selectAll();
            return answers;
        }
        return null;
    }
}
