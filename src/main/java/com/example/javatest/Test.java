package com.example.javatest;

import java.util.Scanner;


/**
 * 编写程序，要求输入若干整数，输入的同时计算前面输入各数的乘积，若乘积超过 100000，
 * 则认为是异常，捕获并处理这个异常，输出信息。
 */
public class Test {

    public static void main(String[] args) {

        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void test() throws Exception {
        Scanner input = new Scanner(System.in);
        int sum = 1;
        while (true) {
            System.out.println("请输入一个整数:");
            int nextInt = input.nextInt();
            sum *= nextInt;
            if (sum >= 100000) {
                throw new Exception("乘积超过 100000");
            }
        }
    }
}














