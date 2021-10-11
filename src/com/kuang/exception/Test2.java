package com.kuang.exception;

public class Test2 {

    // 快捷键 ： ctrl + alt + T
    // option + command + T
    public static void main(String[] args) {
        int a = 11;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();  // 打印错误的栈信息
            System.exit(100);
        } finally {
        }
    }
}


