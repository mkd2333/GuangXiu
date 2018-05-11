package com.example.demo.service.impl;

import com.example.demo.core.ret.ServiceException;
import com.example.demo.dao.UserInfoMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Resource
    private UserInfoMapper userInfoMapper;


    @Override
    public void register(Integer acoount, String password, String nickname) {


    }

    @Override
    public UserInfo getAccount(Integer account, String password) {
      UserInfo userInfo = userInfoMapper.getAccount(account,password);
      return userInfo;
    }
}
