package com.kuang.array;

public class ArrayDemo03 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};

        // 打印全部的数组元素
        for(int i=0; i< array1.length; i ++){
            System.out.println(array1[i]);
        }
        System.out.println("========");

        // 计算所有元素的和
        int sum = 0;
        for(int i=0; i<array1.length; i++){
            sum += array1[i];
        }
        System.out.println(sum);
        System.out.println("========");

        // 查找最大元素
        int max = array1[0];
        for(int i=0; i< array1.length; i++){
            if (array1[i]>max){
                max = array1[i];
            }
        }
        System.out.println("max:" + max);
    }
}
