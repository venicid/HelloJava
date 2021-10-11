package com.kuang.flow;

public class Demo05_for {

    /**
     * 打印99乘法表
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t") ;
                if(i==j){
                    System.out.print("\n");
                }
            }

        }
    }
}
