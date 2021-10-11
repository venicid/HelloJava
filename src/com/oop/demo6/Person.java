package com.oop.demo6;

public class Person {

    protected String name = "kuangshen";

    public Person() {
        System.out.println("Person无参数执行");
    }

    public void print(){
        System.out.println("Person");
    }

    // 私有的东西无法被继承
    private void print1(){
        System.out.println("Person");
    }





}
