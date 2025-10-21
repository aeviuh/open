package com.aeviih.core.面向对象.基础;

public class 创建类_调用属性_调用方法 {
    public static void main(String[] args){
        Test x = new Test();
        System.out.println(x.str);
        System.out.println(x.f);
        x.x();
    }
}

// 类名 对象名 = new 类名();
// 对象名.属性;
// 对象名.方法();
// 成员变量定义完整格式:修饰符 数据类型 变量名 = 初始化值;