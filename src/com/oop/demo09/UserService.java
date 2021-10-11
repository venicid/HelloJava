package com.oop.demo09;

// 抽象的思维~ JAVA 架构师

// interface 定义的关键字： 接口都需要实现类
public interface UserService {

    // 常量~
    public static final int AGE = 99;
    int SALARY = 88;

    // 接口中的所有定义的方法其实都是抽象的 Public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}


