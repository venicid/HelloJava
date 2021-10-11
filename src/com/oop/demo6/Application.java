package com.oop.demo6;

public class Application {

    public static void main(String[] args) {

        Student student = new Student();
        student.test1("秦疆");
        student.test2();

        // 静态方法与非静态方法的区别很大
        // 静态方法，与类同时生成，相当于一个单独的方法
        // 静态方法，方法的调用之和，左边定义的数据有关
        A a = new A();
        a.test();   // A...

        B b = new A();
        b.test();   // B...

        // 非静态，重写
        // 父类的引用指向子类
        A a1 = new A();  // 子类重写了父类的方法
        B b1 = new A();
        a1.print();   // A print....
        b1.print();   // A print....

    }
}
