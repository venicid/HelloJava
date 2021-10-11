package com.kuang.array;

import java.util.Arrays;

// 稀疏数组
public class ArrayDemo08 {
    public static void main(String[] args) {

        // 1、创建一个二维数组 11*11    0没有棋子   1黑棋  2 白棋
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;

        System.out.println("输出原始数组：");
        for (int[] array: array1){
            for(int value: array){
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        // 2、构造1个稀疏数组，获取有效值的个数
        System.out.println("===========");

        int sum=0;
        for (int i = 0; i < array1.length -1; i++) {
            for (int j = 0; j < array1[i].length-1; j++) {
                if(array1[i][j] != 0){
                    sum += 1;
                }
            }
        }

        int[][] array2 = new int[sum+1][3];
        array2[0][0] = array1.length;
        array2[0][1] = array1[0].length;
        array2[0][2] = sum;
        for (int i = 0; i < array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
        System.out.println("==========");

        // 3、遍历二维数组，将非零值，放在稀疏数组中
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if(array1[i][j] != 0){
                    count += 1;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        // 4、输出稀疏数组
        System.out.println("稀疏数组");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }


        System.out.println("===========");
        System.out.println("还原");

        // 1、读取稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        for (int i = 0; i < array3.length; i++) {
            System.out.println(Arrays.toString(array3[i]));
        }
        // 2、给其他的元素还原它的值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        // 3. 打印
        System.out.println("=======");
        for (int[] array: array3){
            for(int value: array){
                System.out.print(value + "\t");
            }
            System.out.println();
        }

    }
}


/*
输出原始数组：
0	0	0	0	0	0	0	0	0	0	0
0	0	1	0	0	0	0	0	0	0	0
0	0	0	2	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
===========
[11, 11, 2]
[0, 0, 0]
[0, 0, 0]
==========
稀疏数组
[11, 11, 2]
[1, 2, 1]
[2, 3, 2]
===========
还原
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
=======
0	0	0	0	0	0	0	0	0	0	0
0	0	1	0	0	0	0	0	0	0	0
0	0	0	2	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0
0	0	0	0	0	0	0	0	0	0	0

* */