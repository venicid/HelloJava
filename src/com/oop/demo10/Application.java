package com.oop.demo10;

public class Application {

    public static void main(String[] args) {


        Outer outer = new Outer();
        outer.out();

        // 通过这个外部类实例化内部类
        // 快捷键： option + enter
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getId();


    }
}
