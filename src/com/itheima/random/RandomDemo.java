package com.itheima.random;
import java.util.Random;
import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);//10内随机数 0~9
        int num1 = r.nextInt(100)+1;//1~100的随机数
    }
}
