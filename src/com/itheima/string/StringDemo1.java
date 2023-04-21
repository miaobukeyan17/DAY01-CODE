package com.itheima.string;

import com.itheima.domain.Student;

public class StringDemo1 {
    public static void main(String[] args) {
        /*
                String 类 特点:
                    1. Java程序中所有双引号字符串, 都是String这个类的对象
                    2. 字符串一旦被创建 , 就不能更改
                    3. String 字符串虽然不可改变, 但是可以被共享

                                字符串常量池 : 当我们使用双引号创建字符串对象时, 会检查常量池中是否存在该数据
                                    不存在: 创建
                                    不存在: 复用
         */
        String s = "abc";
        s = "def" ;
        System.out.println(s);
        Student stu = new Student(23,"张三");
        stu = new Student(24,"李四");
        System.out.println(stu.getNaem() + "-----" + stu.getAge());
        String s1 = "abc";
        String s2 = "abc";
//String 是引用数据类型 故比较的是地址
        System.out.println(s1 == s2); //true
    }
}
