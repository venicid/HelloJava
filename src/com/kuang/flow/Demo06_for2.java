package com.kuang.flow;

public class Demo06_for2 {

    /**
     * java5+
     * @param args
     */
    public static void main(String[] args) {

       int[] a = {1,2,4,5,6};
       int[] b = new int[3];
       b[0] = 1;
       b[1] = 2;
       b[2] = 3;

       for(int item : a){
            System.out.println(item);
        }

       for (int item:b){
           System.out.println(item);
       }
    }
}
