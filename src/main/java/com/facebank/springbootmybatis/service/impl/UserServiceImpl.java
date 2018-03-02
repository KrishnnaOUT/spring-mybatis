package com.facebank.springbootmybatis.service.impl;

import com.facebank.springbootmybatis.domain.User;
import com.facebank.springbootmybatis.mapper.UserMapper;
import com.facebank.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户表service实现
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public List<User> findByName(String name) {
        List<User> users = userMapper.findByName(name);
        return users;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public Long findCount() {
        return userMapper.findCount();
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }
}
