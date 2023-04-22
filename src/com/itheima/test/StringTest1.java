package com.itheima.test;

import java.util.Scanner;

public class StringTest1 {
    /*
            需求:
                模拟用户登录,一共三次机会,登录之后给出相应提示

                1. 定义两个字符串类型的变量 , 模拟已经存在的字符串和密码
                2. 键盘录入用户输入的用户名与密码
                3. 比对
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "123";



        //比较
        for(int i = 1 ;i <=3 ;i++){
            System.out.println("请输入用户名");
            String inputUsername = sc.nextLine();
            System.out.println("请输入密码");
            String inputPassword = sc.nextLine();
            if ((inputUsername.equals(username) && inputPassword.equals(password))){
                System.out.println("登陆成功");
                return;
            }else {
                if (i<=2) {
                    System.out.println("用户名或密码错误第" + i + "次错误,请重新输入");
                }else{
                    System.out.println("你已经错误"+i+"次,已被冻结");
                }
            }
        }


    }
}
