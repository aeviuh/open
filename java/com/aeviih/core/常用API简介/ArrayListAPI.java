package com.aeviih.core.常用API简介;

import java.util.ArrayList;

public class ArrayListAPI {
    public static void main(String[] args){
        {
            // 创建对象
            // 泛型:限定集合中存储数据的类型
            ArrayList<String> list = new ArrayList<String>();
            // ArrayList<String> list = new ArrayList<>();// 后面尖括号数据类型可以省略
            System.out.println(list);
        }
        {
            // 1.创建一个对象
            ArrayList<String> list1 = new ArrayList<>();

            // 2.添加元素add()
            list1.add("a");
            list1.add("1");
            System.out.println(list1);

            // 3.删除元素remove()
            // list1.remove("a");// 直接传递元素
            list1.remove(0);// 索引删除
            System.out.println(list1);

            // 4.修改元素set()
            list1.set(0,"abc");
            System.out.println(list1);

            // 5.查询元素get()
            System.out.println(list1.get(0));

            // 获取长度size()
            list1.add("333");
            System.out.println(list1.size());

        }
    }
}
