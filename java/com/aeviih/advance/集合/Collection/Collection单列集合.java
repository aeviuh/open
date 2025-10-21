package com.aeviih.advance.集合.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection单列集合 {
    public static void main(String[] args){
        /* Collection是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的
         *
         * public boolean add(E e)             // 添加
         * public void clear()                 // 清空
         * public boolean remove(E e)          // 删除
         * public boolean contains(Object obj) // 判断是否包含
         * public boolean isEmpty()            // 判断是否为空
         * public int size()                   // 集合长度
         */

//        Collection是一个接口,不能直接创建他的对象
        Collection<String> coll = new ArrayList<>();

        // 1.添加
        coll.add("q");
        coll.add("a");
        coll.add("b");
        coll.add("c");
        System.out.println(coll);

        // 2.清空
        //coll.clear();

        // 3.删除
        // 细节1：因为Collection里面定义的是共性的方法,所以此时不能通过索引进行删除.只能通过元素的对象进行删除.
        // 细节2：方法会有一个布尔类型的返回值,删除成功返回true,删除失败返回false
        //       如果要删除的元素不存在,就会删除失败.
        coll.remove("q");
        System.out.println(coll);

        // 4.判断元素是否包含
        // 细节：底层是依赖equals方法进行判断是否存在的.
        //      所以,如果集合中存储的是自定义对象,也想通过contains方法来判断是否包含,
        //      那么在javabean类中,一定要重写equals方法.
        // equals在Object类中的方法,比较的是地址值
        boolean result = coll.contains("a");
        System.out.println(result);

        // 5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        // 6.获取集合的长度
        int size = coll.size();
        System.out.println(size);

    }
}
