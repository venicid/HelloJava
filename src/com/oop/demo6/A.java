package com.oop.demo6;

// 继承
public class A extends B{

    public static void test(){
        System.out.println("A...");
    }

    // Override重写
    @Override // 注解：有功能的注释
    public void print() {
        System.out.println("A print....");
    }
}


