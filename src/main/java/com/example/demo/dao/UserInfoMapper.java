package com.example.demo.dao;

import com.example.demo.model.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {

    UserInfo getAccount(@Param("account") Integer account,@Param("password") String password);

    void  insertAccount(@Param("account") Integer account,@Param("password") String passeord,@Param("nickname") String nickname)    ;

}
