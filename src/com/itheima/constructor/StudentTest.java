package com.itheima.constructor;

public class StudentTest {
    /*
        构造方法(构造器):

                创建对象的时候,要执行的方法

            格式:
                    1.方法名与类名相同
                    2.大小写一致
                    3.没有返回值类型 无void
                    4.没有具体的返回值(不能由return返回数据)
            执行时机:
                    在创建对象时,被调用执行
                    每创建一次对象就执行一次
            构造方法的作用:
                        1.本质:创建对象
                        2.集合执行时机:执行时创建对象时,完成初始化操作
     */
    public static void main(String[] args) {
            Student stu1 = new Student("张三",23);
            Student stu2 = new Student("李四",24);
        System.out.println(stu1.name+"---"+stu1.age);
        System.out.println(stu2.name+"---"+stu2.age);
    }
}
