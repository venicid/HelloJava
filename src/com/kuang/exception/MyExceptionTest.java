package com.kuang.exception;

public class MyExceptionTest {

    public static void main(String[] args) {
        int a = 11;
        try {
            test(11);
        } catch (MyException e) {
            // e.printStackTrace();
            // 增加一些异常处理的代码
            if(a>10){
                System.out.println("处理中。。。");
            }
            System.out.println("MyException===>" + e);
        }
    }

    static void test(int a) throws MyException {
        System.out.println("传递的参数为：" + a);

        if(a>10){
            throw new MyException(a); // 抛出
        }
        System.out.println("ok");
    }
}
