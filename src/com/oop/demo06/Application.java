package com.oop.demo06;

public class Application {

    public static void main(String[] args) {

        // 一个对象的实际类型是确定的
        new Person();
        new Student();

        // 可以指向的引用类型就不确定了：父类的引用指向子类

        // Student能调用的方法都是自己的或继承父类的
        Student s1 = new Student();

        // Person 父类型，可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

        // 对象能执行那些方法，主要看对象左边的类型，和右边关系不大！
        s1.run();
        s2.run();
        s1.eat();
        ((Student) s2).eat();  // 子类重写了父类的方法，执行子类的方法

        /*
         * 多态注意事项
         * 1. 多态是方法的多态，属性没有多态
         * 2. 父类和子类，有联系， 类型转化异常！  ClassCastException！
         * 3. 存在条件：继承关系，方法需要重写，父类引用指向子类对象！ Father f1 = new Son();
         *
         * 不能重写的方法
         * 1. static 方法，属于类，它不属于实例
         * 2. final 常量
         * 3. private 方法
         * */

    }
}
