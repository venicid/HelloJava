package com.kuang.exception;

public class Test3 {

    public static void main(String[] args) {

        try {
            test(11, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    // 假设这个方法中，处理不了这个异常。throws 方法上抛出异常
    public static void test(int a, int b) throws ArithmeticException{
        if(b == 0){
            // 算术异常
            throw new ArithmeticException(); // 主动抛出异常，一般在方法中使用
        }
    }
}
