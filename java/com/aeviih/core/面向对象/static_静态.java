package com.aeviih.core.面向对象;

public class static_静态 {
    public static void main(String[] args){
        Test_static test1 = new Test_static();
        Test_static test2 = new Test_static();

        // static:静态,可以修饰成员变量,成员方法
        // 静态变量被该类所有对象共享
        // 静态变量属于类,不属于对象
        test1.setAllName("abc");// 不建议用对象名调用
        // System.out.println(test2.getAllName());// 不建议用对象名调用
        System.out.println(Test_static.getAllName());// 建议类名调用
    }
    {
//        静态方法只能访问静态变量和静态方法
//        非静态方法可以访问静态变量或者静态方法也可以访问非静态的成员变量和非静态的成员方法
//        静态方法中是没有this关键字
//        静态优先于对象加载,属于类,不属于对象
    }
}

class Test_static {
    private String name;
    private int age;
    private static String allName;

    //以下是标准JavaBean

    public Test_static() {
    }

    public Test_static(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getAllName() {
        return allName;
    }

    public static void setAllName(String allName) {
        Test_static.allName = allName;
    }
}