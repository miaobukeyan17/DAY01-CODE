package com.itheima.list;
import java.util.ArrayList;
public class ArrayListDemo2 {
    /*
       增删查改

     */
    public static void main(String[] args) {

        ArrayList<String>  list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        System.out.println(list.get(0));

        list.set(0,"s");

        System.out.println(list);

    }
}
