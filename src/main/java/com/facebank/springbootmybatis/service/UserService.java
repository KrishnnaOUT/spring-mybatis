package com.facebank.springbootmybatis.service;

import com.facebank.springbootmybatis.domain.User;

import java.util.List;

/**
 * 用户表接口
 */
public interface UserService {

    /**
     * 插入新用户
     * @param user
     * @return
     */
    int saveUser(User user);

    /**
     * 根据姓名查询用户
     * @param name
     * @return
     */
    List<User> findByName(String name);

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 查询总记录数
     * @return
     */
    Long findCount();

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 根据用户id删除用户
     * @param id
     * @return
     */
    int deleteById(Integer id);
}
