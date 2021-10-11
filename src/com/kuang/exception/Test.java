package com.kuang.exception;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // 假设要捕获异常，从小打到！

        try{   // try监控区域
            int res = a / b;
        }catch (Error e){  // catch(想要捕获的异常类型！)
            System.out.println("Error");
        }catch (Exception e){
            System.out.println("程序出现异常，变量b不能为0");
        }catch (Throwable t){
            System.out.println("Throwable ");
        } finally {  // 处理善后操作
            System.out.println("finally");
        }
        // finally 可以不要，  假设IO、资源关闭，需要

    }



}
