package com.kuang.base;

/*

Q: 变量命名规范：
除了类名，每个单词首字母大写 class AddSum
常量，全部是大写+下划线  MAX_NUM
其他都是驼峰 userName
*/

public class Constant {

    static final int MAX_NUM = 100;

    public static void main(String[] args) {

        // 常量用final修饰
        final double PI = 3.14;
        System.out.println(PI);

        // PI = 3.3;  // java: 无法为最终变量PI分配值
        System.out.println(PI);

        System.out.println(MAX_NUM);
    }
}
