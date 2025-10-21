package com.aeviih.core.elif;

public class 循环 {
    public static void main(String[] args){
        //continue;当前循环体为空,直接进入下一次循环
        //break;结束本次循环
        {//for
//            for(初始化语句;条件判断语句;条件控制语句){
//                循环体语句;
//            }
            for(int i=0;i<10;i++){
                System.out.println(i);
            }
        }
        {//while
//            while(条件判断语句){
//                循环体语句;
//            }
            int i=0;
            while (i<10){
                System.out.println(666);
                i++;
            }
        }
        {//do while
//            循环体先执行语句
//            do{
//                循环体语句;
//            } while(条件判断语句);
        }
    }
}
