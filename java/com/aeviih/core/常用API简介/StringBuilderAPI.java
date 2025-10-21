package com.aeviih.core.常用API简介;

public class StringBuilderAPI {
    public static void main(String[] args){
        // 空参构造,
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);

        // 有参构造,传递字符串
        StringBuilder sb2 = new StringBuilder("abc");// 初始化为abc
        System.out.println(sb2);

        // 添加元素append()
        sb2.append(1);
        sb2.append(1.1);
        sb2.append(true);

        System.out.println(sb2);

        // 反转reverse()
        StringBuilder sb3 = new StringBuilder("1234567890");
        System.out.println(sb3.reverse());

        // 获取长度length()
        System.out.println(sb3.length());// int类型

        // 把StringBuilder类型转为String类型toString()
        String str = sb3.toString();
        System.out.println(str);
    }
}
