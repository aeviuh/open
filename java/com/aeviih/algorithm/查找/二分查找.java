package com.aeviih.algorithm.查找;

public class 二分查找 {
    public static void main(String[] args){
        //必须是有序的,每次排除一半的查找范围
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 150));
    }

    public static int binarySearch(int[] arr, int number){
        int min = 0;
        int max = arr.length - 1;

        while(true){
            if(min > max){
                return -1;
            }
            int mid = (max + min) / 2;

            if(arr[mid]>number){
                max = mid - 1;
            }else if (arr[mid] < number){
                mid = mid +1;
            }else{
                return mid;
            }
        }
    }
}
