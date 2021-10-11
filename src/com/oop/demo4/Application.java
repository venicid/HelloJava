package com.oop.demo4;


/*
1. 提高程序的安全性，保护数据
2. 隐藏代码的细节
3. 统一接口
4. 系统可维护性增加了
* */
public class Application {

    public static void main(String[] args) {
        Student student = new Student();

        // 重载：方法名，参数列表
        student.setName("kuangshen");
        System.out.println(  student.getName());

        student.setAge(-1); // 不合法的
        System.out.println(student.getAge());

    }
}
