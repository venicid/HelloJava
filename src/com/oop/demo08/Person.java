package com.oop.demo08;

public class Person extends Action{

    // 继承抽象类，必须实现其方法
    @Override
    public void doSomething() {

    }

    public static void main(String[] args) {
        // new Action();     // 抽象类，不能实例化
    }
}
