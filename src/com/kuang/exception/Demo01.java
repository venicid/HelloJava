package com.kuang.exception;


/*
Q: 异常分为2大类
A：
1、错误Error
    - Java虚拟机生产
    - 与执行者操作无关
2、异常Exception
    - 运行时异常RuntimeException

* */
public class Demo01 {

    public static void main(String[] args) {

        //   java.lang.StackOverflowError
        // a();

        // java.lang.ArithmeticException: / by zero
        // System.out.println(11/0);
    }

    public static void a(){
        b();
    }
    public static void b(){
        a();
    }
}


