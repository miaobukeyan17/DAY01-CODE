package com.itheima.mif;
import java.util.Scanner;


public class IfDemo {
    public static void main(String[] args) {
        ifTest1();
    }

    public static void ifTest1(){
        /*
            IF 语句格式
            返回true false
         */

        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄");

        System.out.println("开始");

        int age = sc.nextInt();

        if (age >= 18 && age<=100){
            System.out.println("可以上网吧");

        }else if (age > 100){
            System.out.println("老的上不了了");
        }
        else {
            System.out.println("不可以上网吧");
        }
        System.out.println("结束");
    }
}
