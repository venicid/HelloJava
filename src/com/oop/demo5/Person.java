package com.oop.demo5;

// 在java中，所有的类都直接或间接继承object类
// Person 人： 父类
public class Person /*extends Object*/{

    // public
    // private
    // default
    // protected

    public int money;

    public void say(){
        System.out.println("说了一句话");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
