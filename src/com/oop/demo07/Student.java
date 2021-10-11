package com.oop.demo07;

// static
public class Student {

    // static 类变量
    private static int age;  // 静态的变量 多线程
    private double score;  // 非静态的变量


    public void run(){
        go();
    }

    // 类方法
    public static void go(){

    }


    public static void main(String[] args) {
        Student s1 = new Student();

        // 属性
        System.out.println(Student.age);
        // System.out.println(Student.score);
        System.out.println(s1.age);
        System.out.println(s1.score);

        // 方法
        Student.go();
        go();
        s1.go();

        // Student.run();
        s1.run();
        // run();

    }


}
