package com.itheima.domain;

public class Student {
    /*
            1. 成员变量私有化
            2.空参带参构造方法
                快捷方式alt+fn+ins
            3.对于私有成员变量,提供get set相关方法

     */
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String naem) {
        this.age = age;
        this.name = naem;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return naem
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{age = " + age + ", naem = " + name + "}";
    }
}
