package com.kuang.array;

public class ArrayDemo05 {
    public static void main(String[] args) {

        /*
        [4][2] 面向对象

        1,2 array[0]
        2,3 array[1]
        3,4 array[2]
        4,5 array[3]
        * */
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};
        System.out.println(array[0][0]);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);

            }

        }
    }
}
