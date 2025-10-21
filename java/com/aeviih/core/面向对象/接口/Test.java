package com.aeviih.core.面向对象.接口;

public class Test {
    public static void main(String[] args){
        Cat cat = new Cat(18,"love");
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        cat.eat();
        cat.xxx();
    }
}
