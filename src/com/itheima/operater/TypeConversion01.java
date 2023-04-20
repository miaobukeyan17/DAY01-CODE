package com.itheima.operater;

public class TypeConversion01 {
    /*
    类型转换-隐式转换
    内部自动完成
    介绍:小的给大的赋值可以直接赋值
     */
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println(b); //10.0
        System.out.println(a);
        double d = a + b;
    }
}
