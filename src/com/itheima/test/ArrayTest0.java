package com.itheima.test;

public class ArrayTest0 {
    public static void main(String[] args) {
        printArray();

    }
    public static void printArray(){
        int[] arr = {11,22,33,44,55};
        for (int j : arr) {
            System.out.println(j);
        }
        /*
        for (int i = 0;i < arr.length;i++ ){
            System.out.println(arr[i]);
        }
         */
    }
}
