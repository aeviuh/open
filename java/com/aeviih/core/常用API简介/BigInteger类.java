package com.aeviih.core.常用API简介;

import java.math.BigInteger;

public class BigInteger类 {
    public static void main(String[] args){
        // 大整数
        BigInteger big1 = new BigInteger("6666666666666");// 获取一个指定的大整数
        System.out.println(big1);

        // 指定进制的大整数
        BigInteger big2 = new BigInteger("10110101",2);
        System.out.println(big2);

        // 算数
        BigInteger a = new BigInteger("1234567");
        BigInteger b = new BigInteger("1234567");
        System.out.println("算数:\n"+a.add(b));// 加法
        System.out.println();

    }
}
