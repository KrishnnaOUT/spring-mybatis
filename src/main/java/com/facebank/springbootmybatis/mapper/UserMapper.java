package com.facebank.springbootmybatis.mapper;

import com.facebank.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User映射接口
 */
@Mapper
@Repository
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    @Select("SELECT * FROM user")
    List<User> findAll();

    /**
     * 查询总记录数
     * @return
     */
    @Select("SELECT COUNT(*) FROM user")
    Long findCount();

    /**
     * 通过姓名模糊查询对应用户
     * @param name
     * @return
     */
    @Select("SELECT * FROM user WHERE name LIKE \"%\"#{name}\"%\"")
    List<User> findByName(String name);

    /**
     * 插入/新增新用户
     * @param user
     * @return
     */
    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    int saveUser(User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    @Update("UPDATE user SET name = #{name},age = #{age} WHERE id = #{id}")
    int updateUser(User user);

    /**
     * 根据用户id删除用户信息
     * @param id
     * @return
     */
    @Delete("DELETE FROM user WHERE id = #{id}")
    int deleteById(Integer id);

}
