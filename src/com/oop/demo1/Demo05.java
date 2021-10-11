package com.oop.demo1;

// 引用传递：对象，本质还是值传递
// 对象，内存
public class Demo05 {

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);  // null

        Demo05.change(person);
        System.out.println(person.name);  // kuangshen
    }

    public static void change(Person person){

        // person是1个对象：指向的是1个具体的人--> Person person = new Person();
        // 这是1个具体的人，可以改变属性
        person.name = "kuangshen";
    }
}


// 定义了1个Person类，有1个属性name
class Person{
    String name;
}