package com.aeviih.core.面向对象;

public class 代码快 {
    //{}// 构造代码快创建对象时,优先于构造方法执行
    //ststic{}// 静态代码快.优先于构造方法执行,随着类加载而加载,只执行一次
    public static void main(String[] args){
        Test_代码快 test1 = new Test_代码快();
        Test_代码快 test2 = new Test_代码快();
        Test_代码快 test3 = new Test_代码快();
    }
}
class Test_代码快{
    static{
        System.out.println("静态代码快执行");
    }
    {
        System.out.println("构造代码快执行");
    }
    Test_代码快(){
        System.out.println("构造方法执行");
    }
}