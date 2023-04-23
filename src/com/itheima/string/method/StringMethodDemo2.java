package com.itheima.string.method;

public class StringMethodDemo2 {
    public static void main(String[] args) {
        /*
            public char[] toCharArray(String[] args)
                将字符串转化为一个字符数组
            public char charAt(int index)
                返回指定索引处的 char 值。
         */
        print2();

    }
//  第二种 此方法会调用多次length()方法 进栈出栈太多次 故效率比第一次底
    private static void print2() {
        String s = "itheima";
        for (int i=0;i<s.length();i++){
        char c =  s.charAt(i);
        System.out.println(c);
        }
    }

    //成员方法不加static
//    第一种遍历方式 效率更高
    private static void print1() {
        String s1 = "item";
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
