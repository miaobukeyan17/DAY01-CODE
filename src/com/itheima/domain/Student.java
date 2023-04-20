package com.itheima.domain;

public class Student {
    /*
            1. 成员变量私有化
            2.空参带参构造方法
                快捷方式alt+fn+ins
            3.对于私有成员变量,提供get set相关方法

     */
    private int age;
    private String naem;

    public Student() {
    }

    public Student(int age, String naem) {
        this.age = age;
        this.naem = naem;
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
    public String getNaem() {
        return naem;
    }

    /**
     * 设置
     * @param naem
     */
    public void setNaem(String naem) {
        this.naem = naem;
    }

    public String toString() {
        return "Student{age = " + age + ", naem = " + naem + "}";
    }
}
