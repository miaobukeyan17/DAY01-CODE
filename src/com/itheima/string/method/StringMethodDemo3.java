package com.itheima.string.method;

public class StringMethodDemo3 {
    /*
          public  String substring(int beginIndex) :根据传入的索引开始截取,截取到字符串的末尾
                返回一个新的字符串，它是此字符串的一个子字符串。
           public String substring(int beginIndex, int endIndex) : 截取传入索引中间的字符串
                 返回一个新字符串，它是此字符串的一个子字符串。

     */
    public static void main(String[] args) {
        String s = "kabsdlkba";
        String s1 = s.substring(3);
        System.out.println(s1); //sdlkba
        String s2 = s.substring(4,6);
        System.out.println(s2); //dl
        System.out.println(s);

    }
}
