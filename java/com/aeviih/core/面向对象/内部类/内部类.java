package com.aeviih.core.面向对象.内部类;

public class 内部类 {// 这是外部类,访问内部类成员必须创建对象
    String strs = "你好";
    int xs = 666;

    public void show(){
        Test_内部类 test = new Test_内部类();//
        test.outTest();
    }

    class Test_内部类{// 这是内部类,可以直接访问外部类成员.包括私有
        String str;
        int x;
        public void outTest(){
            System.out.println("内部类打印"+strs+xs);
        }
    }

}
