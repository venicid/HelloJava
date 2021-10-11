package com.kuang.method;

public class Demo01 {

    // main方法
    public static void main(String[] args) {

        // 实际参数：实际调用传递给它的参数
        int sum = add(3,4);
        System.out.println(sum);

        test();
    }


    // 加法
    // 形式参数，用来定义作用的
    public static int add(int a, int b){
        return a + b;
    }

    // 求和
    public static void test(){
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }


}
