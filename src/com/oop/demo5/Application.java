package com.oop.demo5;

public class Application {

    public static void main(String[] args) {

        Student student = new Student();
        student.say();
        student.money = 10;
        student.getClass();
        System.out.println(student.money);

        student.setName("kuangshen");
        System.out.println(student.getName());
    }
}


