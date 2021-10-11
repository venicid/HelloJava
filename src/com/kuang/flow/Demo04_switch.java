package com.kuang.flow;

import java.util.Scanner;

public class Demo04_switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNext()){
            switch (scanner.next()){
                case "fat":
                    System.out.println("请到fat环境操作");
                    break;
                case "uat":
                    System.out.println("请到uat环境操作");
                    break;
                case "pre":
                    System.out.println("请到pre环境操作");
                    break;
                case "pro":
                    System.out.println("请到pro环境操作");
                    break;
                default:
                    System.out.println("不存在该环境，请重试");
            }
        }

        scanner.close();
    }
}
