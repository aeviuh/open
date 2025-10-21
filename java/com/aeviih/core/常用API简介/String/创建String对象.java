package com.aeviih.core.常用API简介.String;

public class 创建String对象 {
    public static void main(String[] args){
        // 使用直接赋值方式获取字符串对象
        String s1 = "name";
        System.out.println("1:"+s1);

        // 空参构造,使用new方式,获取空白字符串对象
        String s2 = new String();
        System.out.println("2:"+s2);

        // 有参构造,传递一个字符串
        String s3 = new String("abc");
        System.out.println("3:"+s3);

        // 有参构造,传递字符串数组
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println("4:"+s4);

        // 有参构造,传递字节数组
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println("5:"+s5);
    }
}
