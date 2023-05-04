package com.itheima.test;

import com.itheima.domain.stu;
import org.w3c.dom.Element;
import org.w3c.dom.ls.LSInput;

import javax.management.Query;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMassage {
    public static void main(String[] args) {
        ArrayList<stu> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----欢迎来到学生管理系统----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请选择");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加学生");
                    addStudent(list);
                    break;
                case 2:
                    System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case 3:
                    System.out.println("修改学生");
                    updateStudentInfoById(list);
                    break;
                case 4:
                    System.out.println("查看学生");
                    queryStudentInfos(list);
                    break;
                case 5:
                    System.out.println("感谢使用,再见");
                    System.exit(0); //终止jvm虚拟机 这里写什么整数都行
                    break;
                default:
                    System.out.println("您输入有误,请检查");
                    break;
            }
        }
    }

    //修改学生信息
    private static void updateStudentInfoById(ArrayList<stu> list) {
        if (list.size() == 0) {
            System.out.println("请先录入信息");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要修改的学生学号");
            String s = sc.nextLine();
            int index = getIndex(s, list);
            if (index == -1) {
                System.out.println("学号不存在");
            } else {
                System.out.println("请输入新的学生信息");
                System.out.println("姓名:");
                String name = sc.next();
                System.out.println("年龄:");
                int age = sc.nextInt();
                System.out.println("生日");
                String birthday = sc.next();
                //将新录入的学生信息 封装为学生对象

                stu stu1 = new stu(s, name, age, birthday);
                list.set(index, stu1);
            }
        }

    }

    //此方法查看学生
    private static void queryStudentInfos(ArrayList<stu> list) {
        if (list.size() == 0) {
            System.out.println("无信息,请添加后重试");
        } else {
            for (int i = 0; i < list.size(); i++) {
                stu stu = list.get(i);
                System.out.println(stu.getId() + "----" + stu.getName() + "----" + stu.getAge() + "----" + stu.getBirthday());
            }
        }

    }

    private static void addStudent(ArrayList<stu> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        System.out.println("请输入学生生日");
        String birthday = sc.next();
        stu stu = new stu(id, name, age, birthday);

        list.add(stu);

    }

    private static void deleteStudent(ArrayList<stu> list) {
        if (list.size() == 0) {
            System.out.println("现在还没有学生信息,请先输入");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生学号");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).getId();
            if (id.equals(s)) {
                list.remove(i); //此方法会导致 当删除一个元素时 原来的位置会空出来
                //会把后面的元素整体向前移一位
                i--;           //故 使用一次i--操作
            } else {
                System.out.println("此学号不存在");
            }
        }
        /*
            第二种方法是逆向遍历
         */

    }

    //找到id对应的索引位置并返回
    private static int getIndex(String id, ArrayList<stu> list) {
        for (int i = 0; i < list.size(); i++) {
            stu stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
