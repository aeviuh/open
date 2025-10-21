package com.aeviih.core.面向对象;

public class 重新认识main方法 {
    public static void main(String[] args){
        // []:数组
        // String:数据类型
        // args:数组名

        System.out.println(args.length);// 默认为零
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
    {
//        public:被JVM调用,访问权限足够大
//        static:被JVM调用,不用创建对象,直接访问类名
//            因为main方法是静态的,所以测试类中其他方法也需要静态
//        void:被JVM调用,不需要返回值
//        main:通用的名称,被JVM识别
//        String[] args:以前被用于键盘录入,现在没有用,为了向下兼容
    }
}
