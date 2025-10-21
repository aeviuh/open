package com.aeviih.advance.Lambda表达式;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda表达式介绍 {
    public static void main(String[] args){
        Integer[] arr1 = {2,1,4,3,6,5,8,7,0,9,0};
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr1));

        /**Lambda表达式可以用于简化匿名内部类的书写
         * Lambda表达式只能简化函数式接口的匿名内部类的书写
         * 函数式接口:有且仅有一个抽象方法的接口叫做函数式接口,接口类上方可以加@FunctionalInterface注解
         *
         * Lambda表达式省略规则:
         *      1.参数类型可省略不写
         *      2.只有一个参数,()可省略
         *      3.方法体只有一行,大括号分号return可省略,需要同时省略
         */
        Integer[] arr2 = {2,1,4,3,6,5,8,7,0,9,0};
        Arrays.sort(arr2,(Integer o1,Integer o2)-> {
            return o2-o1;
        });
        System.out.println(Arrays.toString(arr2));
    }
}
