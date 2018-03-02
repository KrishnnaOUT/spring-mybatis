package com.facebank.springbootmybatis.controller;


import com.facebank.springbootmybatis.domain.User;
import com.facebank.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findByName/{name}")
    @ResponseBody
    public List<User> findByName(@PathVariable("name") String name) {
        return userService.findByName(name);
    }

    @GetMapping("/findCount")
    @ResponseBody
    public String findCount() {
        Long count = userService.findCount();
        return "总记录数为：" + count;
    }

    @PostMapping("/saveUser")
    @ResponseBody
    public String saveUser(User user) {
        int row = userService.saveUser(user);
        if (row > 0) {
            return "添加成功";
        }
        return "添加失败";
    }

    @PutMapping("/updateUser")
    @ResponseBody
    public String updateUser(User user) {
        int row = userService.updateUser(user);
        if (row > 0) {
            return "更新成功";
        }
        return "更新失败";
    }

    @DeleteMapping("/deleteById/{id}")
    @ResponseBody
    public String deleteById(@PathVariable("id") Integer id) {
        int row = userService.deleteById(id);
        if (row > 0) {
            return "删除成功";
        }
        return "删除失败";
    }

}
