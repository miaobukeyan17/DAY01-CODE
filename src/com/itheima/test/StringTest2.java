package com.itheima.test;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();

        char[] c = s.toCharArray();
        statisticalCharacters(c);

    }

    private static void statisticalCharacters(char[] c) {
        int b = 0;
        int g = 0;
        int d = 0;
        int h = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                b++;
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                g++;
            } else if (c[i] >= '0' && c[i] <= '9') {
                d++;
            } else {
                h++;
            }

        }
        System.out.println("小写字符" + b + "个");
        System.out.println("大写字符" + g + "个");
        System.out.println("数字字符" + d + "个");
        System.out.println("其它字符" + h + "个");
    }


}
