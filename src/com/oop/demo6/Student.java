package com.oop.demo6;

public class Student extends Person{

    private String name = "qingjing";

    public Student() {
        // this.test2(); 报错
        // 隐藏代码：调用了父类的无惨构造
        super(); // 调用父类的构造器，必须要在子类构造器的第一行

        System.out.println("Student 无参数执行");
    }

    public void test1(String name){
        System.out.println(name); // 秦疆
        System.out.println(this.name); // qinjiang
        System.out.println(super.name); // kuangshen
    }

    public void print(){
        System.out.println("Student");
    }
    public void test2(){
        print();        // Student
        this.print();   // Student
        super.print();  // Person
    }



}
