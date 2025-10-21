package com.aeviih.core.面向对象;

public class 多态 {
    public static void main(String[] args){
        // 多态:同类型对象,表现出不同的形态
        // 表现形式:父类类型 对象名称 = 子类对象;
        // 前提:有继承关系,有父类引用指向子类对象{父类 test = new 子类();},有方法重写

        /*
        多态调用成员特点:
            父类 test = new 子类();
            test.成员变量// 使用父类
            test.成员方法()// 使用子类
            编译时候,父类必须有这些成员变量和成员方法
         */

        /*
        多态的弊端:
            创建对象时候,父类没有的成员方法,子类即便有也不能使用(解决方案:强制转换为子类,不能瞎转换,否则会报错)
            instanceof关键字
         */

        {// 以下为测试代码
            Person_多态 s = new Student_多态();
            s.setAge(10);
            s.setName("学生");

            Person_多态 t = new Teacher_多态();
            t.setAge(100);
            t.setName("老师");

            Person_多态 admin = new Administrator_管理员();
            admin.setAge(1000);
            admin.setName("管理员");

            // 传递不同对象
            register(s);
            register(t);
            register(admin);
        }

    }

    // 这个方法能接受老师,学生,管理员三个类
    // 形参只能是这三各类的父类
    public static void register(Person_多态 p){
        p.show();// 这个方法均被子类重写
    }
}
class Person_多态{// 父类
    private String name;
    private int age;

    public Person_多态(){
        ;
    }

    public Person_多态(String name,int age){
        this.name = name;
        this.age = age;
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

    public void show(){
        System.out.println(name+","+age);
    }
}

class Student_多态 extends Person_多态{// 学生
    @Override
    public void show(){
        System.out.println("学生的信息为:"+getName()+", "+getAge());
    }
}

class Teacher_多态 extends Person_多态{
    @Override
    public void show(){
        System.out.println("老师的信息为:"+getName()+", "+getAge());
    }
}

class Administrator_管理员 extends Person_多态{
    @Override
    public void show(){
        System.out.println("管理员的信息为:"+getName()+", "+getAge());
    }
}
