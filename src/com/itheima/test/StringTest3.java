package com.itheima.test;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {


        numberMasking();
    }

    private static void numberMasking() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phone = sc.nextLine();

        if (judgmentNumber(phone)&&judgmentCharacter(phone)){

            String s1 = phone.substring(0, 3);
            String s2 = phone.substring(7, 11);
            System.out.println(s1 + "****" + s2);
        }else {
            numberMasking();
        }

    }

    public static Boolean judgmentNumber(String phone) {
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if (c >= '0' && c <= '9') {
                break;
            } else {
                System.out.println("手机号不能包含数字除外的其它字符请重新输入");
                return false;
            }
        }
        return true;
    }
    public static Boolean judgmentCharacter(String phone){
        if (phone.length() != 11 ) {
            System.out.println("手机号必须为11位！请重新输入");
            return false;
        }else {
            return true;
        }
    }
}


