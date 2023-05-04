package com.itheima.test;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String count = sc.nextLine();
        judgingPalindromicCharacters(count);//判断回文字符

    }

    private static void judgingPalindromicCharacters(String count) {
        StringBuilder sb = new StringBuilder(count);
        sb.reverse();
        if (count.equals(sb.toString())){  //比较时类型必须保持一致
            System.out.println("是回文字符");
        }else {
            System.out.println("不是回文字符");
        }
    }
}
