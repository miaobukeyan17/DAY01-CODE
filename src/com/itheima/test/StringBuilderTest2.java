package com.itheima.test;

import java.util.Scanner;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个串 数字");
        int a = sc.nextInt();
        int[] arr = intArray(a);
        arrayToString(arr);
    }

    public static int[] intArray(Integer num) {
        String str = num.toString();// 转化为字符串
        int[] intArray = new int[str.length()];// 新建一个数组用来保存num每一位的数字
        for (int i = 0; i < str.length(); i++) {
            // 遍历str将每一位数字添加如intArray
            Character ch = str.charAt(i);
            intArray[i] = Integer.parseInt(ch.toString());
        }
        return intArray;
    }


    public static void arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            //获取到元素 拼接到缓冲区
            sb.append(arr[i]).append(",");
        }
        sb.append(arr.length).append("]");
        System.out.println(sb);

    }
}
