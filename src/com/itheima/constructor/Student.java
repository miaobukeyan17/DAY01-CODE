package com.itheima.constructor;

public class Student {
    int age;
    String name;

    public Student() {
    }

    public  Student(String name , int age) {
        this.name = name;
        this.age = age;
         System.out.println("我是student类的构造方法");
    }
}
