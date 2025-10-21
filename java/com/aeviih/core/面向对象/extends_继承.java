package com.aeviih.core.面向对象;

public class extends_继承 {
    public static void main(String[] args){
        {// 基本说明
//        public class Student extends Person{};// 前者是子类(派生类),后者是父类(基类或超类)
//        继承后子类可以得到父类的属性和行为,子类可以使用
//        java只支持单继承,不支持多继承,支持多层继承
//        每一个类都直接(直接父类)或者间接(非直接父类)的继承Object类(默认有5个虚方法),由JVM来完成
        }
        {// 继承说明
//            构造方法不能被继承!!!
//            成员变量,非私有和private修饰的都能被继承(私有属性被继承后依然是私有的)!!!
//            成员方法,(只有虚方法表可被继承!!!!)private修饰的成员方法不能被继承
        }
        {// this,super,就近原则
//            this:代表所在方法调用者的地址值
//            super:直接调用父类成员
        }
        {// 方法重写:子类重写父类方法(本质:重写虚方法表!!!!)
//            @Override:建议在重写的方法上加上这个,更加安全
//            只有被添加到虚方法表中才能被重写

//            注意1:重写方法名称,形参列表必须与父类一致,错一个字母都不行!!
//            注意2:子类重写父类方法时:访问权限必须大于等于父类(空着不写<protected<public)
//            注意3:子类重写父类方法时:返回值类型必须小于等于父类

//            建议1:尽量和父类保持一致
//            注意4:私有方法不能被重写(其实没有被继承)
//            注意5:不能重写静态方法,否则会报错
        }
        {
            Btest bt = new Btest();
            bt.x1();

            Ctest ct = new Ctest();
            ct.x1();
        }
    }
}

class Atest{
    public void x1(){
        System.out.println("x1()");
    }
}

class Btest extends Atest{
    @Override
    public void x1(){
        System.out.println("重写");
    }
//    @Override// 检验是否覆盖父类方法,否则直接报错
//    public void x2(){
//        System.out.println(1);
//    }
}

class Ctest extends Btest{
    ;
}