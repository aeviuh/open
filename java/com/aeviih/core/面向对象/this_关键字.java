package com.aeviih.core.面向对象;

public class this_关键字 {
    // 就近原则:成员变量和局部变量重名时,优先使用最近的;
    // 直接使用成员变量:this.变量
    // 作用:区分局部变量和成员变量
    // this本质:所在方法调用者的地址值

    // this(...);表示调用本类构造
    int age;
    public static void main(String[] args){
        int age=10;
        System.out.println("就近原则:"+age);
        // System.out.println("this:"+this.age);// 可能因为static不可执行
    }
}
