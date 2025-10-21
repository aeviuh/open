package com.aeviih.core.function;

public class 方法重载 {
    public static void main(String[] args){
        test01(1.1);
        test01(1);
        test01(1,2);
        test01(1,2,3);
    }
    //方法构成重载2个条件:多个同名方法,但形参不同
    public static void test01(double a){
        System.out.println(0);
    }
    public static void test01(int a){
        System.out.println(1);
    }
    public static void test01(int a,int b){
        System.out.println(2);
    }
    public static void test01(int a,int b,int c){
        System.out.println(3);
    }
}
