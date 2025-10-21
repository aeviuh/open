package com.aeviih.core.常用API简介;

import java.util.Scanner;// 导入对象

//    Scanner sc = new Scanner(System.in);
//    sc.nextLine();// 建议,仅遇到回车停止录入

public class ScannerAPI {
    public static void main(String[] args){
        // 创建对象
        Scanner sc = new Scanner(System.in);
        //
        double x1 = sc.nextDouble();// 返回一个小数
        String x2 = sc.next();// 返回一个字符串,遇到空格,制表符,回车停止录入
        System.out.println(x1);
        System.out.println(x2);
        // ...

        String str = sc.nextLine();// 仅遇到回车停止录入
        System.out.println(str);

    }
}
