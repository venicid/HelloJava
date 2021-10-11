package com.kuang.flow;

import java.util.Scanner;

public class Demo02_scanner2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收");
        if (scanner.hasNext()){
            String str = scanner.nextLine();

            System.out.println("输出内容为：" + str);
        }

        scanner.close();
    }
}

/*
使用nextLine方式接收
dfas esadefaes 3
输出内容为：dfas esadefaes 3
*/