package com.oop.demo07;

public class Person {

    // 2、赋初始值
    {
        System.out.println("匿名代码块");
    }

    // 1、只执行一次~
    static {
        System.out.println("静态代码块");
    }

    // 3
    public Person(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        new Person();
        System.out.println("========");
        new Person();
    }

    /*
    静态代码块
    匿名代码块
    构造方法
    ========
    匿名代码块
    构造方法
    * */

}
