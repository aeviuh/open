package com.aeviih.core.面向对象.接口;

public interface 接口 {
    int a = 10;
    public abstract void xxx();
}
// 接口中的成员变量只能是常量,默认修饰符public static final(缺省值)
// 构造方法:没有,接口没有构造方法
// 成员方法:只能是抽象方法,默认修饰符:public abstract

// 新特性:关键字:default有方法体,private接口内部使用 ,static不能被重写