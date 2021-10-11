package com.kuang.flow;

public class Demo07_printStart {

    /**
     * 打印五角星号
     *      *
     *     ***
     *    *****
     *   *******
     * @param args
     */
    public static void main(String[] args) {

//        for (int i = 0; i <  5; i++) {
//            for (int j = 0; j < 5 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i < 5; i++) {
            System.out.print(" ");
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

