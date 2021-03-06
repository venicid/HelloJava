package com.oop.demo08;

// abstract 抽象类： 类 extends : 单继承    (接口可以多继承)
public abstract class Action {

    // 约束！ 有人帮我们实现~
    // abstract，抽象方法，只有方法名称，没有方法的实现
    public abstract void doSomething();

    public void go(){

    }

    // 1. 不能new这个抽象类，只能靠子类去实现它：约束
    // 2. 抽象类中可以写普通的方法！
    // 3. 抽象方法必须在抽象类中~
    // 抽象的抽象：约束~

    // 思考题？ new, 存在构造器吗？
              // 存在的意义 抽象出来~  提高开发效率


}
