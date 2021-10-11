package com.oop.demo2;

// 学生类
public class Student {

    // 属性：字段
    String name;  // null
    int age;  // 0

    // 方法
    public void study(){
        System.out.println(this.name + "正在学习...");
    }

}


// 学程序好？对世界进行更好的建模  --- 宅！音乐，旅游，出国


/*
  public static void main(String[] args) {

        // 类：抽象的，需要实例化
        // 类实例化后会返回1个自己的对象
        // student对象就是1个Student类的具体实例

        new Student();
        Student student = new Student();
        Student xiaoming = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 30;
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        Student com.kuang = new Student();
        com.kuang.name = "狂神";
        System.out.println(com.kuang.name);
        com.kuang.study();
    }


小明
30
狂神
狂神正在学习...
*/
