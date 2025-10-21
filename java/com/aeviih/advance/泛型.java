package com.aeviih.advance;

public class 泛型 {
    public static void main(String[] args){
        /**java中的泛型是伪泛型,编译class文件会检查数据类型,实际存的是Object类型
         * 泛型必须是引用数据类型
         * 可以在类后面(泛型类),方法上面(泛型方法),接口后面(泛型接口)
         * 泛型不具备继承性
         *
         * ? 表示不确定类型(通配符)
         * ? extends E // 表示只能传递E或者E的子类
         * ? super E // 表示只能传递E或者E的父类
         */

        泛型类<String> s = new 泛型类<>();
        s.add("12345");
        System.out.println(s.get(1));

    }

    //泛型方法
    public <E> void func(E a){
        ;
    }
}

class 泛型类<E>{
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[--index];
    }
}