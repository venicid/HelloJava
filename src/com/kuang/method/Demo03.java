package com.kuang.method;


public class Demo03 {

    // 命令行传参
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+ i +"] "+args[i]);
        }
    }
}

/*

liangshuo276@hb15276:~/Learning/kuangshen/ProjectJava/src/com.kuang/method » javac Demo03.java
liangshuo276@hb15276:~/Learning/kuangshen/ProjectJava/src/com.kuang/method » java Demo03
错误: 找不到或无法加载主类 Demo03
liangshuo276@hb15276:~/Learning/kuangshen/ProjectJava/src/com.kuang/method » cd ..                                                                                          1 ↵
liangshuo276@hb15276:~/Learning/kuangshen/ProjectJava/src/com.kuang » cd ..
liangshuo276@hb15276:~/Learning/kuangshen/ProjectJava/src » java com.kuang.method.Demo03
liangshuo276@hb15276:~/Learning/kuangshen/ProjectJava/src » java com.kuang.method.Demo03 this is com.kuang
args[0] this
args[1] is
args[2] com.kuang

* */