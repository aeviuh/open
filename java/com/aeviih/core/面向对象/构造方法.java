package com.aeviih.core.面向对象;

public class 构造方法 {
//    {// 构造方法写法
//        修饰符 类名(参数){
//            方法体;
//        }
//    }
//    方法名与类名相同,大小写也要一致
//    没有返回值类型,连void都没有
//    没有具体的返回值(不能由return带回结果数)
//    创建对象的时候由虚拟机调用,不能手动调用构造方法
//    每创建一次对象,就会调用一次构造方法
//    如果没有定义构造方法,系统将给出一个默认的无参数构造方法
//    如果定义了构造方法,系统将不再提供默认的构造方法(默认构造方法视为已删除)
//    构造方法可重载

    public static void main(String[] args){
        Test_构造方法 test = new Test_构造方法();
    }
}

class Test_构造方法{
    public Test_构造方法(){
        System.out.println("Test_构造方法测试");
    }
}
