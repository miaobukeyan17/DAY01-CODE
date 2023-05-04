package com.itheima.list;

import java.util.ArrayList;

public class ArrayListDemo1 {
    /*
            ArrayList使用

            1. 集合的构造
            ArrayList()
            2. 集合容器的创建细节
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("李四");
        list.add("张三");
        list.add("王五");
        System.out.println(list);

    }
}
