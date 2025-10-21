package com.aeviih.advance.集合.Collection.Collection迭代方式;

import java.util.ArrayList;
import java.util.Collection;

public class 增强for遍历 {
    public static void main(String[] args){
        /* 增强for遍历,底层是iterable迭代器,为了简化书写
         * jdk5之后出现的
         * 所有的单列集合和数组才能使用增强for遍历进行遍历
         *
         * 格式:
         *      for(元素的数据类型 变量名 : 数组或者单列集合){}
         */

        // 演示,创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");
        coll.add("e");
        coll.add("f");
        // 使用增强for遍历
        for(String s : coll){
            System.out.print(s+" ");
        }

    }
}
