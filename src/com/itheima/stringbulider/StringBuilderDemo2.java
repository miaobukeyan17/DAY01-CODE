package com.itheima.stringbulider;

public class StringBuilderDemo2 {
    /*
        StringBuilder的介绍
            1.一个可变字符序列
            2.StringBuilder是一个字符缓冲区,将其理解为容器,这个容器可以存储任意数据,但只要进入这个容器,都变成字符串

     */
    public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
/*            sb.append(100);
            sb.append(100);
            sb.append(false);
            sb.append(100);
            sb.append(100);
            sb.append(45.6);
            sb.append('中');
            sb.append("hyr加油");
        System.out.println(sb);  //100100false10010045.6中hyr加油  这里打印的也不是地址*/

        System.out.println(sb);
        sb.append("蓝色");
        System.out.println(sb);
        sb.append("绿色");
        System.out.println(sb);
        sb.append("黄色");
        System.out.println(sb);
//
//        蓝色
//                蓝色绿色
//        蓝色绿色黄色

        StringBuilder s = new StringBuilder("abc");
        System.out.println(s);
    }
}
