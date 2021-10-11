package com.oop.demo10;

import com.oop.demo09.UserService;


// 思想： ~~~

public class Test {
    public static void main(String[] args) {

        // 没有名字初始化类，不用讲实例保存到变量中~
        new Apple().eat();

        UserService userService = new UserService() {
            @Override
            public void add(String name) {

            }

            @Override
            public void delete(String name) {

            }

            @Override
            public void update(String name) {

            }

            @Override
            public void query(String name) {

            }
        };
    }
}



class Apple{

    public void eat(){
        System.out.println("1");
    }
}