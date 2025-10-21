package com.aeviih.工具类;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays类 {
    public static void main(String[] args){
        /**操作数组的工具
         * public static void sort(数组) // 可以对数组进行排序,支持基本数据类型,对象类型,对于对象类型,需要该对象实现Comparable接口或者传入Comparator
         * public static void sort(数组,排序规则) // 只能排序引用数据类型
         * public static String toString(数组) // 把数组拼接成一个字符串
         * public static int binarySearch(数组,查找的元素) // 二分法查找元素
         * public static void fill(数组, 值) // 用指定值填充整个数组
         * public static void fill(数组, 起始索引, 结束索引, 值) // 用指定值填充数组指定范围
         * public static int[] copyOf(原数组, 新长度) // 复制数组，指定新数组长度
         * public static int[] copyOfRange(原数组, 起始索引, 结束索引) // 复制数组的指定范围[m,n)
         */

        System.out.println("---toString---");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));

        System.out.println("---binarySearch---");
        System.out.print(Arrays.binarySearch(arr,10)+" ");// 存在,返还索引
        System.out.println(Arrays.binarySearch(arr,11));// 不存在,返还返还插入点-1

        System.out.println("---copyOf---");
        int[] newArr1 = Arrays.copyOf(arr,5);// 数值小于原数组,部分拷贝
        int[] newArr2 = Arrays.copyOf(arr,10);// 数值等于原数组,等于就完全拷贝
        int[] newArr3 = Arrays.copyOf(arr,15);// 数值大于原数组,初始化新的数据
        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(newArr2));
        System.out.println(Arrays.toString(newArr3));

        System.out.println("---copyOfRange---");
        int[] newArr4 = Arrays.copyOfRange(arr,0,9);// 拷贝索引0-8,[m,n)
        System.out.println(Arrays.toString(newArr4));

        System.out.println("---fill---");
        Arrays.fill(arr,888);
        System.out.println(Arrays.toString(arr));// 数据填充

        System.out.println("---sort---");
        int[] arr2 = {3,2,5,4,7,6,1,8,9,0};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));// 默认升序排序,底层用的是快速排序

        System.out.println("---sort(自定义规则)---");
        Integer[] arr3 = {3,2,5,4,7,6,1,8,9,0};
        // 下面第二个参数传递了匿名内部类,对Comparator重载
        Arrays.sort(arr3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 -o2;// 升序
                return o2 -o1;// 降序
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
