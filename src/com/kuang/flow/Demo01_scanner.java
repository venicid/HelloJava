package com.kuang.flow;

import java.util.Scanner;

public class Demo01_scanner
{
    public static void main(String[] args) {

        // 创建1个扫描器对象，
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收");
        if(scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输出内容为：" + str);
        }

        // 凡是属于IO流的类，如果不关闭会一直占用资源
        scanner.close();
    }
}


/*
使用next方式接收
    ddd   33
输出内容为：ddd
* */