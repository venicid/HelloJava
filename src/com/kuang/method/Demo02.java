package com.kuang.method;

public class Demo02 {

    public static void main(String[] args) {

        // java都是值传递
        int result = max(10,20);
        System.out.println(result);

        // 方法的重载：有相同的函数名，但形式参数不同的函数
        /*
        方法重载的规则：
            方法名，必须相同
            参数列表必须不同
        */
        double res = max(10.0, 13.4);
        System.out.println(res);
    }

    // 比大小
    public static int max(int num1, int num2){
        int res = 0;
        if(num1 == num2){
            System.out.println("num1==num2");
            return 0;  // 终止方法
         }

        if(num1 > num2){
            res = num1;
        }else{
            res = num2;
        }
        return res;

    }


    public static double max(double num1, double num2){
        double res = 0;
        if(num1 == num2){
            System.out.println("num1==num2");
            return 0;  // 终止方法
        }

        if(num1 > num2){
            res = num1;
        }else{
            res = num2;
        }
        return res;
    }
}
