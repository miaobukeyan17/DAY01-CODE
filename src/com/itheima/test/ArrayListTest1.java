package com.itheima.test;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
       // 创建一个存储字符串的集合, 内部存储三个字符串元素, 使用程序实现在控制台遍历该集合;
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("哈哈");
        list.add("王五");
        //遍历

        for (int i= 0; i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
