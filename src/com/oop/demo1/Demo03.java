package com.oop.demo1;

public class Demo03 {
    public static void main(String[] args) {

        // 实际参数和形式参数的值类型，一一对应
        int res = Demo03.add(3,4);
        System.out.println(res);
    }

    public static int add(int a, int b){
        return a+b;
    }
}
