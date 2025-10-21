package com.aeviih.core.array;

import java.util.Arrays;

public class 数组的定义 {
    public static void main(String[] args) {
        //建议
        int[] arr1 = {1, 2, 3};

        //不建议(完整格式)
        int[] arr2 = new int[]{1, 2, 3};

        //二维数组定义
        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}};
        //打印arr3
        System.out.println(Arrays.toString(arr3[0])+Arrays.toString(arr3[1]));
    }
}
