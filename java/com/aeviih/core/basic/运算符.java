package com.aeviih.core.basic;

public class 运算符 {
    public static void main(String[] args){
        {//算数运算符
            //加+
            System.out.println(1 + 1);
            //减-
            System.out.println(1 - 1);
            //乘*
            System.out.println(5 * 5);
            //除/
            System.out.println(6 / 3);
            //取模,取余%
            System.out.println(8 % 3);
        }
        {//数据类型问题
            //数字运算必须是相同的数据类型才能计算
            //隐式转换:计算式自动取值范围小转大
            //byte short char 三种类型的数据在运算的时候,都会直接先提升为int,然后再进行运算
            //强制转换:人为强制转换
            double a1=12.3;
            System.out.println(a1);
            System.out.println((int)a1);//强制转换:(数据类型)变量名
        }
        {//高级用法+
            //"字符串"连接符('a'等字符对应表的数值)
            System.out.println("123"+123);
            System.out.println(1+99+"你好");//100你好Y 199你好N

        }
        {//自增自减运算符++,--
            int a2=10;
            a2++;
            System.out.println(a2);
            ++a2;
            System.out.println(a2);
            a2--;
            System.out.println(a2);
            --a2;
            System.out.println(a2);
        }
        {//赋值运算符=,+=,-=,*=,/=,%=
            /*
            a=b
            a+=b 等同于 a=(a的类型)(a+b)
            a-=b(a=a-b)
            ...
             */
        }
        {//关系(比较)运算符==,!=,>,>=,<,<=(返还true,false)(boolean类型)
            System.out.println(1>2);
        }
        {//逻辑运算符&,|,!,^
            System.out.println(true & false);
            System.out.println(true | false);
            System.out.println(!false);
            System.out.println(true ^ false);
        }
        {//短路逻辑运算符&&,||
            //与&,|相同,效率更高(具有短路效果)
            //合理选择!!!
        }
        {//三元运算符,格式:关系表达式?表达式1:表达式2;
            int x=1,y=2;
            //不能直接写x>y?x:y;,必须打印,赋值等
            int z=x>y?x:y;
            System.out.println("z:"+z);
            System.out.println(x>y?x:y);
        }
        {//左移,右移,无符号右移<<,>>,>>>
            //<<向左移动,低位补0
            //>>向右移动,高位补1或0(根据原来正负位)
            //>>>向右移动,高位补0
        }
    }
}