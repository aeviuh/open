package com.aeviih.advance.正则表达式;

public class Test {
    public static void main(String[] args){
        //public boolean matches(String regex)// String类中的方法,判断是否匹配

        //只能是a b c
        System.out.println("只能是a b c");
        System.out.println("a".matches("[abc]"));// true
        System.out.println("z".matches("[abc]"));// false
        //不能是a b c
        System.out.println("不能是a b c");
        System.out.println("z".matches("[^abc]"));// true
        //匹配a-z A-Z
        System.out.println("匹配a-z A-Z");
        System.out.println("s".matches("[a-zA-Z]"));// true
        System.out.println("1".matches("[a-zA-Z]"));// false
        //匹配任意数字
        System.out.println("匹配任意数字");
        System.out.println("1".matches("\\d"));// 转义\用\\ true

        //匹配数字,字母,下划线,最少六个
        System.out.println("匹配数字,字母,下划线,最少六个");
        System.out.println("asejklugfh".matches("\\w{6,}"));// true
        System.out.println("asejk".matches("\\w{6,}"));// false
    }
}
