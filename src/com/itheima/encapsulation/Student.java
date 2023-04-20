package com.itheima.encapsulation;

public class Student {
    private int age;
    public void setAge(int age){
        if (age >=1 && age <= 120){
            this.age = age;
        }else {
            System.out.println("滚");
        }
    }
    public int getAge(){
        return this.age;
    }
}
