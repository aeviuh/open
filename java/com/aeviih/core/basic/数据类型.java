package com.aeviih.core.basic;

public class 数据类型 {
    public static void main(String[] args){
        /**整数类型：默认初始化值     0
         * 小数类型：默认初始化值     0.0
         * 字符类型：默认初始化值     '\u0000'
         * 布尔类型：默认初始化值     false
         * 引用数据类型：默认初始化值  null
         * --------------------------------------------------------------
         * 基本数据类型有,整数(初始化值0),浮点(初始化值0.0),字符,布尔(初始化值false)
         * 基本数据类型存储在自己的空间中,真实值,赋值给其他变量也是真实值
         * 引用数据类型,存储在其他空间中,自己存储地址值
         * 引用数据类型,赋值给其他变量也是地址值
         * int [] arr = {1,2,3};arr是引用数据类型,String,类,接口是引用数据类型
         * 引用数据类型默认初始化值是null
         */
        //整数
        byte    a=1;       //1
        short   b=2;       //2
        int     c=3;       //4
        long    d=4l;      //8
        long    e=4L;      //8

        //浮点数
        float   f=1.1f;    //4
        float   g=1.1F;    //4
        double  h=1.1;     //8

        //字符
        char    i='a';     //2

        //布尔
        boolean j=true;    //1
        boolean k=false;   //1
    }
}
