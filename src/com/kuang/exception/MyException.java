package com.kuang.exception;

// 自定义异常
public class MyException extends Exception{

    // 快捷键：两次shift

    // 传递数字>10
    private int detail;

    public MyException(int a){
        this.detail = a;
    }

    // toString: 异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +  "detail=" + detail + '}';
    }
}
