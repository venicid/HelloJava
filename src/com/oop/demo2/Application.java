package com.oop.demo2;

// 一个项目应该只存在一个main方法
public class Application {

    public static void main(String[] args) {

    // new 实例化了1个对象
    Person person = new Person("kuangshen", 30);

    System.out.println(person.name);

    }
}
