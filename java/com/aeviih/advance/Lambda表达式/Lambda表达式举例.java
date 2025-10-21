package com.aeviih.advance.Lambda表达式;

public class Lambda表达式举例 {
    public static void main(String[] args){
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳..");
            }
        });

        //用Lambda表达式改写
        method(
                ()->{
                    System.out.println("Lambda表达式");
            }
        );
    }

    public static void method(Swim s){
        s.swimming();
    }
}

@FunctionalInterface
interface Swim{
    public abstract void swimming();
}