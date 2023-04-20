package com.itheima.test;

import com.itheima.domain.Movie;

import java.util.Scanner;

public class MovieService {


    private Movie[] movies;//创建一个成员变量
    private Scanner sc = new Scanner(System.in);


    public MovieService(Movie[] movies) {
/*        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }*/
        //将传进来的数据交给成员变量 就能在类中任意地方使用了
        this.movies = movies;
    }

    public void start() {
        /*
            启动电影信息管理系统
         */

        //展示菜单,用户自己选择功能

        lo:
        while (true) {
            System.out.println("-------电影信息管理系统--------");
            System.out.println("请输入你的选择");
            System.out.println("1. 查询全部电影信息");
            System.out.println("2. 根据id查询电影信息");
            System.out.println("3. 退出");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queryMovieInfos();
                    break;
                case 2:
                    queryMovieInfoById();
                    break;
                case 3:
                    System.out.println("感谢使用 退出");
                    break lo;
                default:
                    System.out.println("您的输入有误 请检查");
                    break;
            }
        }

    }

    //      根据电影编号查询电影详细信息
    /*
        1.输入编号
        2.遍历数组,从数组中查询电影信息
        3.将找到的电影信息输出
    */
    private void queryMovieInfoById() {
        System.out.println("请输入您要查询的电影编号");
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            if (id == movie.getId() ){
                System.out.println(movie.getId()+"-------"+movie.getTitle()+
                        "-------"+movie.getTime()+ "-------"+movie.getScore()+
                        "-------"+movie.getArea()+"-------"+movie.getType()+
                        "-------"+movie.getDirector()+"-------"+movie.getStarring());
                return;
            }

        }
//        代码走到这里说明没找到
        System.out.println("您输入的编号不存在,请检查重新输入");
    }

    //展示系统中全部的电影 (名称 评分)
    private void queryMovieInfos() {
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
//            直接打印movie 你会看到地址
//            通过电影对象,调用内部getXxx方法,获取信息并打印
            System.out.println(movie.getTitle() + "------" + movie.getScore());

        }

    }

}
