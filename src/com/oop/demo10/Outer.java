package com.oop.demo10;

public class Outer {

    private int id;

    public void out(){
        System.out.println("这是外部类的方法");
    }

    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }

        // 获得外部类的私有属性
        public void getId(){
            System.out.println(id);
        }
    }
}
