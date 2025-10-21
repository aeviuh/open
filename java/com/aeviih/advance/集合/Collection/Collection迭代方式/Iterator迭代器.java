package com.aeviih.advance.集合.Collection.Collection迭代方式;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator迭代器 {
    public static void main(String[] args){
        /* Iterator<E> iterator() // 返还迭代器对象,默认指向0索引
         *
         * boolean hasNext() // 判断当前位置是否有元素
         * E next() // 获取当前位置的元素,并将迭代器对象指向下一个位置
         */

        // 注意:
        // 1,报错NoSuchElementException
        // 2,迭代器遍历完毕，指针不会复位
        // 3,每次循环中只能用一次next方法
        // 4,迭代器遍历时,不能用集合的方法进行增加或者删除

        // 演示,创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");
        coll.add("e");
        coll.add("f");
        // 获取迭代器对象
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.print(str+" ");
        }
    }
}
