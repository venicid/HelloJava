package com.kuang.array;

public class ArrayDemo04 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};

        // jdk1.5+, 没有下标， 增强型for
        for (int array : array1) {
            System.out.println(array);
        }

        System.out.println("+========");
        int[] reverse = reverseArray(array1);

        printArray(reverse);
    }


    // 打印数组元素
    public static void printArray(int[] arrays){
        for(int i=0; i<arrays.length; i++){
            System.out.println(arrays[i] + " ");
        }
    }

    // 反转数组
    public static int[] reverseArray(int[] arrays){

         int[] result = new int[arrays.length];

         // 反转的操作
//        for(int i=0; i<arrays.length; i++){
//            int j = arrays.length -1 - i;
//            result[i] = arrays[j];
//        }

        for(int i=0, j= result.length-1; i< arrays.length; i++, j--){
            result[j] = arrays[i];
        }

         return result;
    }
}
