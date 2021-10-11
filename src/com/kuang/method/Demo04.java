package com.kuang.method;

public class Demo04 {

    // 可变参数  int...   指定类型后加一个省略号
    // 方法最后1个参数
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1);
        demo04.test(1,3,4,4,4);

        printMax(1,3,4,5,334.44,2);
    }

    public void test(int... i){
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }

    public static void printMax(double... numbers){
        if(numbers.length == 0){
            System.out.println("No args numbers");
            return;
        }

        double max = numbers[0];

        // 排序！
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max is " + max);
    }
}
