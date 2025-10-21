package com.aeviih.advance.集合.Collection.Collection迭代方式;

import java.util.ArrayList;
import java.util.Collection;

public class Lambda表达式遍历 {
    public static void main(String[]args){
        // 演示,创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");
        coll.add("e");
        coll.add("f");
        // 使用Lambda表达式遍历
//        coll.forEach(new Consumer<String>() {
//            @Override
//            // s代表集合中每一个元素
//            public void accept(String s) {
//                System.out.print(s+" ");
//            }
//        });
        coll.forEach(s -> System.out.print(s+" "));// 简化() -> {}
    }
}
