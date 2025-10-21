package com.aeviih.core.常用API简介;

import java.io.IOException;

public class RuntimeAPI {
    public static void main(String[] args) throws IOException {
        {// Runtime表示当前虚拟机运行的环境
            // Runtime r = new Runtime();// 不能获取,因为无参构造私有化
            Runtime r1 = Runtime.getRuntime();// 这样使用已经创建好的对象,因为虚拟机对象被限制只能创建一个
            Runtime r2 = Runtime.getRuntime();
            System.out.println(r1 == r2);// 对象只能是一个
        }
        {// 停止JAVA虚拟机
            // Runtime.getRuntime().exit(0);
        }
        {// 获取cpu的线程数
            System.out.println(Runtime.getRuntime().availableProcessors());
        }
        {// 虚拟机能获取总内存大小,单位byte
            System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        }
        {// 虚拟机已经获取的总内存大小
            System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        }
        {// 虚拟机剩余内存大小
            System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        }
        {// 运行cmd命令
            // Runtime.getRuntime().exec("notepad");// notepad是打开记事本
            Runtime.getRuntime().exec("calc");// 计算器
            // shutdown是关机命令,加上参数才能执行
            // -s 默认一分钟后关机
            // -s -t指定时间关闭,单位秒
            // -a 取消关机
            // -r 重启
        }
    }
}
