package com.itheima.scanner;

import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        double height = sc.nextDouble();
        boolean flag = sc.nextBoolean();
        String name = sc.next();
        System.out.println(age);
    }
}
