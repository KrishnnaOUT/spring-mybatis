package com.facebank.springbootmybatis.domain;

/**
 * 用户实体类
 */
public class User {
    /**
     * 编号
     * */
    private Integer id;
    /**
     * 姓名
     * */
    private String name;
    /**
     * 年龄
     * */
    private Integer age;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
