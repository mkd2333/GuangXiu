package com.example.demo.service;


import com.example.demo.model.UserInfo;

public interface UserInfoService {

    void register(Integer acoount,String password,String nickname );

    UserInfo getAccount(Integer account, String password);
}
