package com.itheima.网络;
import java.util.Random;

public class Test001 {
    public static void main(String[] args) {
        String code = generateCode();
        while (isAllDigits(code) || isAllUppercase(code)) { // 如果生成的验证码只包含数字或只包含大写字母，就重新生成一个新的验证码
            code = generateCode();
        }
        System.out.println("Verification code: " + code);
    }

    public static String generateCode() {
        String code = ""; // 定义一个空字符串用于存放验证码
        Random random = new Random(); // 创建一个Random对象用于生成随机数
        for (int i = 0; i < 6; i++) { // 循环6次生成验证码
            int type = random.nextInt(2); // 生成0或1的随机数，用于决定生成数字还是字母
            if (type == 0) { // 如果随机数为0，生成数字
                int num = random.nextInt(10); // 生成0-9的随机数
                code += num; // 将数字拼接到验证码字符串中
            } else { // 如果随机数为1，生成字母
                char ch = (char) (random.nextInt(26) + 'A'); // 生成A-Z的随机字母
                code += ch; // 将字母拼接到验证码字符串中
            }
        }
        return code; // 返回生成的验证码字符串
    }

    public static boolean isAllDigits(String code) {
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllUppercase(String code) {
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (!Character.isUpperCase(ch)) {
                return false;
            }
        }
        return true;
    }
}

