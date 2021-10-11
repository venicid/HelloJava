package com.oop.demo06a;


public class Application {

    public static void main(String[] args) {

        // 类型之间的转化：父 子

        // 子类转化为父类，可能丢失自己本来的一些方法
        Student student = new Student();
        student.go();
        Person person = student;
        // person.go()


        /*
        * 1. 父类的引用指向子类的对象
        * 2. 把子类转化为父类，向上转型
        * 3. 把父类转为话子类，向下转型：强制转化
        * 4. 方便方法的调用，减少重复的代码！简洁
        *
        * 封装、继承、多态！ 抽象类，接口！
        *
        * */
    }

    public static void main1(String[] args) {

        // Object -> String
        // Object -> Person -> Teacher
        // Object -> Person -> Student
        // System.out.println(X instanceof Y);  // 编译能不能通过，接口

        Object object = new Student();
        System.out.println(object instanceof Object);  // true
        System.out.println(object instanceof Person);  // true
        System.out.println(object instanceof Student);  // true
        System.out.println(object instanceof Teacher);  // false
        System.out.println(object instanceof String);  // false

        System.out.println("==================");
        Person person = new Student();
        System.out.println(person instanceof Object);  // true
        System.out.println(person instanceof Person);  // true
        System.out.println(person instanceof Student);  // true
        System.out.println(person instanceof Teacher);  // false
        // System.out.println(person instanceof String);  // 编译报错

        System.out.println("==================");
        Student student = new Student();
        System.out.println(student instanceof Object);  // true
        System.out.println(student instanceof Person);  // true
        System.out.println(student instanceof Student);  // true
        // System.out.println(student instanceof Teacher);  // 编译报错
        // System.out.println(person instanceof String);  // 编译报错
    }
}
