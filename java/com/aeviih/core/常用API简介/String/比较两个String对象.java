package com.aeviih.core.常用API简介.String;

public class 比较两个String对象 {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = new String("abc");

        // == 对于引用数据类型比较地址值
        // == 对于基本数据类型比较真实值
        System.out.println(s1 == s2);

        // equals
        System.out.println(s1.equals(s2));

        s2 = "Abc";

        // 忽略大小写比较
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
