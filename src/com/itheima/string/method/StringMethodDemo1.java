package com.itheima.string.method;

public class StringMethodDemo1 {
    /*
            String 中用于比较的方法 :
                public boolean equals(Object anObject)
                        将此字符串与指定的对象比较
                public boolean equalsIgnoreCase(String anotherString)
                        将此 String 与另一个 String 比较，不考虑大小写
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));
        String ss1 = "ABC";
        String SS2 = "abc";
        System.out.println(ss1.equals(SS2));
        System.out.println(ss1.equalsIgnoreCase(SS2)); //验证码校验

    }
}
