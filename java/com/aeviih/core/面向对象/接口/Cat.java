package com.aeviih.core.面向对象.接口;

public class Cat extends Animal implements 接口 {
    public Cat(){
        System.out.println("打印接口中的成员变量a");
        System.out.println(a);
    }

    public Cat(int age,String name){
        super(age,name);
    }

    @Override
    public void eat(){
        System.out.println("Cat类中重写动物类eat()抽象方法,a:"+a);
    }

    @Override
    public void xxx() {
        System.out.println("Cat类中重写xxx()接口");
    }

}
