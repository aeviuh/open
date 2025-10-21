package com.aeviih.core.常用API简介.Object;

public class ObjectAPI {
    public static void main(String[] args){
        // JAVA中顶级父类,所有类都直接,间接继承这个类
        // 只有一个空参构造 public Object()
        // 没有成员变量,有11个成员方法
        // public String toString() // 返还对象的字符串表示形式
        // public boolean equals(Object obj) // 比较两个对象是否相等
        // public Object clone(int a) // 对象克隆

        //1.toString 返还对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);// java.lang.Object@b4c966a
    }
}
