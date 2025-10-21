package com.aeviih.advance.集合.Collection;

import java.util.ArrayList;
import java.util.List;

public class List接口 {
    public static void main(String[] args){
        /* List系列集合特有的方法
         *    void add(int index, E element) // 在指定位置中插入元素
         *    E remove(int index) // 删除并返还元素
         *    E set(int index) // 修改并返还被修改的元素
         *    E get(int index) // 返还指定索引的元素
         *
         * List迭代方式
         *    1.利用get()方法普通for
         *    2.列表迭代器,用list.listIterable()获取列表迭代器对象(有更多方法)
         */

        // 案例
        List<String> list = new ArrayList<>();

        // 1.添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0,"X");
        System.out.println(list);

        // 2.删除元素
        System.out.println("被删除的元素:"+list.remove(0));
        System.out.println(list);

        // 3.修改元素
        list.set(2,"Y");
        System.out.println(list);

        // 4.获取元素
        System.out.println(list.get(0));
    }
}
