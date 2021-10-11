package com.kuang.array;

public class ArrayDemo1 {

    public static void main(String[] args) {

        // 1.声明一个数组
        int [] nums;
        // 2. 创建1个数组
        nums = new int[10];

        int[] nums2 = new int[20]; // 声明并创建

        // 3.给数组元素中赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;

        System.out.println(nums[1]);

        // 计算所有元素的和
        int sum = 0;
        for (int i=0; i< nums.length ; i++){
            sum += nums[i];
        }

        System.out.println("总和为：" + sum);

        // 数组越界 // java.lang.ArrayIndexOutOfBoundsException
        // System.out.println(nums[10]);

        /*
         2
        总和为：21
        * */
    }


}
