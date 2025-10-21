package com.aeviih.advance;

public class 包装类 {
    public static void main(String[] args){
        /**包装类:基本数据类型对应的引用类型
         * byte         ->       Byte
         * short        ->       Short
         * int          ->       Integer
         * long         ->       Long
         * float        ->       Float
         * double       ->       Double
         * char         ->       Character
         * boolean      ->       Boolean
         */

        //Integer i1 = new Integer(1);//jdk5之前,现已废弃
        Integer i1 =1;
        System.out.println(i1);
        int i = i1;//jdk5以后,底层自动转换int和Integer类型
        Integer i2 = i1 +i1;//正常类之间不能加,底层先转换int计算,再转换Integer返还
    }
}
