package com.oop.demo2;

// java ---> class
public class Person {

    String name;
    int age;

    // 一个类即使什么都不写，它也会存在一个方法
    // 显示的定义构造器
    // 与类名相同

    // 实例化初始值
    // 1. 使用new关键字，本质是调用构造器
    // 2. 用来初始化值
    public Person(){
    }

    // 有参数构造器
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 快捷键3：自动生成构造器
    // alt + inert
    // command + n
}


/*
    public static void main(String[] args) {

    // new 实例化了1个对象
    Person person = new Person("kuangshen", 30);

    System.out.println(person.name);

    }

    构造器：
        1、和类名相同
        2、没有返回值
    作用：
        1、new本质在调用构造方法
        2、初始化对象的值
    注意点：
        1、定义有参构造之后，如果想使用无参构造，显示的定义1个无参的构造

     Alt + Inert
     this.name = name
* */