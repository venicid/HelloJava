package com.oop.demo1;

public class Demo02 {

    public static void main(String[] args) {

        // 静态方法调用 static
        Student.sayHi();


        // 非静态方法调用

        // 实例化这个类
        // 对象类型  对象名=对象值；

        // new Student().Run();
        Student student = new Student();
        student.Run();
    }

    // 和类一起加载的
    public static void a(){
        // b();
    };

    // 类实例化才存在
    public void b(){};

}
