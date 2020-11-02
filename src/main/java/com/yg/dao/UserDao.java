package com.yg.dao;

import com.yg.pojo.User;

import java.util.List;

public interface UserDao {
    public int insertUser(User user);
    List<User> selectAllUser(int nowPageNo,int nowPageSize);

}
