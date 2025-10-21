package com.aeviih.core.面向对象;

public class abstract_抽象 {
    public static void main(String[] args){
        // public abstract 返回值类型 方法名(参数列表);// 抽象函数没有方法体
        // 抽象方法子类必须重写
        // public abstract class{}// 有抽象方法一定是抽象类(抽象类不一定有抽象方法),抽象类可以有构造方法
        // 抽象类的子类要么是抽象类,要么重写父类的所有抽象方法
        // 抽象类不能实例化(不能创建对象)
    }
}
abstract class Test_抽象{
    public abstract void work();
}

class Test_ extends Test_抽象{
    @Override
    public void work(){
        System.out.println(1);
    }
}