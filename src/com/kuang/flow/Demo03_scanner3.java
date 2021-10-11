package com.kuang.flow;

import java.util.Scanner;

public class Demo03_scanner3 {

    /**
     * 输入多个数字，求其和、平均数
     * 结束，用其他数组代替
     * @param args
     */
    public static void main(String[] args) {

        double sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        while (true){
            if(scanner.hasNextInt()){
                sum += scanner.nextInt();
                count += 1;
            }else if(scanner.hasNextDouble()){
                sum += scanner.nextDouble();
                count += 1;
            }else{
                scanner.close();
                break;
            }
        }

        System.out.println("sum: " + sum);
        System.out.println("avg: " + sum/count);


    }
}
