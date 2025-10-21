package com.aeviih.core.array;

import java.util.Arrays;

public class 数组初始化方式 {
    public static void main(String[] args) {
        //静态初始化(自动给出数组大小)
        int[] arr1 = {1,2,3,4,5,6,7,8,9,0};

        //动态初始化(用户指定数组大小)
        int[] arr2 = new int[10];

        //打印arr1和arr2
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
