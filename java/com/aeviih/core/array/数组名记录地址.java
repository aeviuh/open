package com.aeviih.core.array;

public class 数组名记录地址 {
    public static void main(String[] args){
        /**
         * [表示当前是数组
         * I表示当前为int
         * @用来分隔
         * 后面才是真正的地址(16进制)
         */

        int[] arr = {1,2,3,4,5};
        //打印arr地址
        System.out.println(arr);
    }
}
