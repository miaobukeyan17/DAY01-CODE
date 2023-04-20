package com.itheima.test;

public class ArrayTest2 {
    public static void main(String[] args) {
        //动态初始化一个10位的int类型的数组,并为它赋予1~100的随机值
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100 + 1);
        }
        int max = getMax(arr1);
        System.out.println("数组最大值为" + max);
    }
    //写一个求数组最大值的方法,命名为getMax
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i-1]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}