package com.kuang.base;

/**
 * 位运算符  >> <<
 *
 * 效率高
 * << 左移  * 2
 * >> 右移  /2
 */
public class Operator {

    public static void main(String[] args) {

        /*
        1000   8
        100    4
        10     2
        */
        int num = 8;
        int num1 = num >> 1;
        int num2 = num1 << 1;

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);


        // 三元运算符
        String env = "PRO";
        String uri = env.equals("PRO") ? "cmdb.mi.com" : "fat-cmdb.mi.com";
        System.out.println(uri);

    }
}
