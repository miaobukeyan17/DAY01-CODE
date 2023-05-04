package com.itheima.stringbulider;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder s1 = sb.append("红色");
        StringBuilder s2 = sb.append("绿色");
        StringBuilder s3 = sb.append("黄色");
        System.out.println(s3);
        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
        System.out.println(s3 == s1);
        System.out.println(s3 == sb);
        //它们共用一块内存


        //链式编程
        StringBuilder sb1 = new StringBuilder();
        int length = sb1.append("1").append("2").append("3").length();
        System.out.println(length);

        String s = "黄亦然";
        String ss = s.substring(2).substring(0); //返回的是切割后 后面的字符串
        System.out.println(ss);
        System.out.println(s);
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse==sb); //reverse 将StringBuilder 类缓冲区  反转字符串
        String sss = sb.toString(); //返回String字符串  目的: 调用StringBuilder 没有的方法 而 String有
        System.out.println(sss);


    }
}
