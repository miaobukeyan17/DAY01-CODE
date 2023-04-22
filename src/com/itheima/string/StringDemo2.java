package com.itheima.string;

public class StringDemo2 {
    public static void main(String[] args) {
        /*     常见构造方法
                  public String() : 创建一个空白的字符串
                  public String(char[]  chs) : 根据传入的字符数组, 创建字符串对象
                  public String(String original) : 根据传入的字符串 ,创建字符串对象
          1.  打印对象会出现地址,打印字符串对象没有出现地址值
            TODO : 面向对象(继承), 方法重写 , Object类 , toString 方法
          2.  这三个构造方法都没有""直接创建来的方便

                String s = "abc";

                --------------------------------------

                字符串对象 , 两种创建方式的区别

                1.双引号直接创建
                2.构造方法创建


         */
// 1
        String s1 = new String();
        System.out.println(s1);
// 2
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println(s2);
// 3
        String s3 = new String("abc");
        System.out.println(s3);

// 4
        String ss1 = "abc";
        String ss2 = "a"+"b"+"c";
        System.out.println(ss1 == ss2);

    }
}
