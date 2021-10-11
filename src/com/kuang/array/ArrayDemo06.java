package com.kuang.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,2,3, 66, 33,12,23};

        System.out.println(a);  // [I@5cad8086

        // 打印数组元素Arrays.toString(a)
        System.out.println(Arrays.toString(a));
        printArray(a);

        // 排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        // 填充
        Arrays.fill(a, 2,4,0);
        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 0);
        System.out.println(Arrays.toString(a));

        /*
        [I@5cad8086
        [1, 2, 3, 66, 33, 12, 23]
        [1, 2, 3, 66, 33, 12, 23][1, 2, 3, 12, 23, 33, 66]
        [1, 2, 0, 0, 23, 33, 66]
        [0, 0, 0, 0, 0, 0, 0]
        * */

    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            if(i==0){
                System.out.print("[");
            }
            if(i==array.length-1){
                System.out.print( array[i] + "]");
            }else{
                System.out.print( array[i] + ", ");
            }

        }
    }
}
