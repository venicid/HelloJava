package com.oop.demo4;


// 类 private: 私有
public class Student {

    // 属性私有
    private String name; // 名字
    private int id; // 学号
    private char sex; // 性别
    private int age;

    // 提供一些可以操作这个属性的方法！
    // 提供一些public的get、set方法

    //get获取这个数据
    public String getName() {
        return this.name;
    }

    // set给这个数据设置值
    public void setName(String name) {
        this.name = name;
    }

    // 快捷键4：自动生成get和set
    // alt+inert
    // command + n

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            this.age = 3;
        } else {
            this.age = age;
        }

    }
}
