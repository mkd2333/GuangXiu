package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.ret.RetResult;
import com.example.demo.core.ret.ServiceException;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("GuangXiu/userInfo")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;


    @PostMapping("/hello")
    public RetResult<String> hello(){

      return RetResponse.makeErrRsp("fail");

    }
/*
    @PostMapping("/register")
    public RetResult<UserInfo> selectById(Integer vesion,Integer id){
            UserInfo userInfo = userInfoService.selectById(id);
            return RetResponse.makeOKRsp(userInfo);
    }
    */

    @PostMapping("/login")
    public RetResult<Integer> login(Integer  account,String password){
        UserInfo userInfo = userInfoService.getAccount(account,password);
        if (userInfo == null)
        {
            throw new ServiceException("用户不存在");
        }
        return RetResponse.makeOKRsp();
       // return RetResponse.makeRsp(200,"successful");
    }




}
