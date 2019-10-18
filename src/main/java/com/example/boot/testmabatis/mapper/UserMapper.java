package com.example.boot.testmabatis.mapper;

import com.example.boot.testmabatis.dao.User;

import java.util.List;

public interface UserMapper {
    User findById(Long id);
    List<User> findAll();
    void inserUser(String firstname, String passwd);
    User selectUser(String firstname, String passwd);
}
