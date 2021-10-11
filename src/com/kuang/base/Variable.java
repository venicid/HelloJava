package com.kuang.base;

import java.util.Date;

/*
type varName [=value];
数据类型  变量名 [= 值];
*/
public class Variable {

    String name = "alex";  // 实例变量

    static int b = 30;   // 类变量
    // int b = 30;  // java: 无法从静态上下文中引用非静态 变量 b

    public static void main(String[] args) {

        // 局部变量 必须声明和初始化
        int a = 10;
        System.out.println(a);

        // 实例变量
        Variable v = new Variable();
        System.out.println(v.name);

        // 类变量 static
        System.out.println(b);




    }


    public static int add(int a, int b) {
        return a + b ;
    }

}
