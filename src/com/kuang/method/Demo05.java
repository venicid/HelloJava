package com.kuang.method;

public class Demo05 {
    // 递归
    public static void main(String[] args) {
        int res = f(4);
        System.out.println(res);
    }

    public static int f(int n){
        if(n == 1){
            return 1;
        }else{
            return n * f(n-1);
        }
    }
    /*
    递归3要素
        - 边界条件
        - 前阶段
        - 返回阶段 n(n-1)

    java 是栈调用的
    * */
}
