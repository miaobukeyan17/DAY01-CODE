package com.itheima.method;
/*
        定义格式:

            public static void 方法名 (){
                方法体(逻辑代码)
            }

       方法的调用格式 :

                方法名();

            注意事项:
                1.方法与方法之间是平级关系,不允许嵌套定义
                2.方法不调用就不执行
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        eat();
        int max0 = getMax(45,50);
    }
    public static int  getMax(int num1,int num2){
        int max = num1 >num2 ? num1 : num2;
        System.out.println(max);
        return max;
    }
    public static void eat(){
        System.out.println("好想吃肯德基呀!");
    }
}
