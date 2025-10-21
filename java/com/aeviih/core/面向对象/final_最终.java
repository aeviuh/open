package com.aeviih.core.面向对象;

public class final_最终 {
    // 方法:表名是最终方法,不能被重写
    public final void func(){};
    // 类:表明是最终类,不能被重写
    // 变量:叫做常量,只能被赋值一次
    final int a= 10;// 基本类型数据值不编
    final int[] arr = new int[10];// 引用类型地址值不变

}
final class TestFinal{}// 不能被继承