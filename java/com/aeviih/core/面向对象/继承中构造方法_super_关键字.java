package com.aeviih.core.面向对象;

public class 继承中构造方法_super_关键字 {
    public static void main(String[] args){
        Student s1 = new Student();

        Student s2 = new Student("aeviih",18);
        System.out.println(s2.name+" "+s2.age);
    }
}

class Person{
    String name;
    int age;
    public Person(){
        System.out.println("父类的无参构造");
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
// 子类所有的构造方法(默认)先访问父类中的无参构造,再执行自己
// 子类构造方法第一行是super();不写也存在,而且必须在第一行,否则报错
// super();代表调用父类的无参构造
class Student extends Person{
    public Student(){
        super();// 必须在构造方法的第一行,否则会报错,不写默认也有
        System.out.println("子类的无参构造");
    }
    public Student(String name,int age){
        super(name,age);// 调用父类的有参构造
    }
}