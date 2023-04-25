package com.itheima.stringbulider;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            sb.append(i);

        }
        System.out.println(sb);
        long end = System.currentTimeMillis();
        System.out.println(end - start); //10
        method();
    }


    private static void method() {
        long start = System.currentTimeMillis();   //获取1970年1月1日0时0分0秒 到现在所经历过的毫秒值(1s = 1000 毫秒)
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end - start); // 2038
    }
}
