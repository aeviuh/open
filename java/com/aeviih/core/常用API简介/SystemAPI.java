package com.aeviih.core.常用API简介;

public class SystemAPI {
    public static void main(String[] args){
        {// 时间戳
            long l = System.currentTimeMillis();
            System.out.println(l);
        }
        {// 把arr1拷贝到arr2中
            int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] arr2 = new int[10];
            System.arraycopy(arr1, 0, arr2, 0, 10);
            // 形参:数据源,从数据源第几个开始,目的地,目的地索引,拷贝个数
            // 数据类型一致
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
        {// 终止JAVA虚拟机
            System.exit(0);// 本质:调用java虚拟机exit方法
        /*
        形参:状态码,0表示虚拟机正常终止,非零表示异常
         */
        }
    }
}
