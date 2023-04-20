package com.itheima.mif;
import  java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        switchTest();
    }
    public static void switchTest(){
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        int week = sc.nextInt();
        switch (week) {
            case 1 -> System.out.println("星期一");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            case 4 -> System.out.println("星期四");
            case 5 -> System.out.println("星期五");
            case 6 -> System.out.println("星期六");
            default -> System.out.println("星期日");
        }
    }
}
