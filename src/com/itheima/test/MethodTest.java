package com.itheima.test;

public class MethodTest {
    public static void main(String[] args) {
        System.out.println("开始");
        getMax();
        System.out.println("结束");
    }

    public static void getMax() {
        int num1 = 10;
        int num2 = 20;

        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
    /*
            需求:定义一个方法,方法中定义两个整数变量,大的打印在控制台
     */
}
