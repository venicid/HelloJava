package com.kuang.array;

import java.util.Arrays;

public class ArrayDemo07 {

    public static void main(String[] args) {

        int[] a = {43,1,14};
        int[] b = sort(a);
        int[] c = sortBetter(a);

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }


    // 冒泡排序
    // 1. 比较数组中，2个相邻的元素，如果第1个数字比第2个大，则交互他们的位置
    // 2. 每次比较，都会产生一个最小的or最大的数字
    // 3. 下一轮比较可以减少一次排序
    // 4. 依次循环，直到结束
    public static int[] sort(int[] array){
        // 临时变量
        int temp = 0;

        // 外层循环，判断我们要走多少次
        for (int i = 0; i < array.length; i++) {

            // 内层循环，比较判断两个丨，如果第一个数比第二个数大，则交换位置
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }

        }
        return array;
    }

    public static int[] sortBetter(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {

            // 通过flag标识减少没有意义的比较
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                break;
            }

        }
        return array;
    }
}
