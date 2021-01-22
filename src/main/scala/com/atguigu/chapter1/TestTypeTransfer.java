package com.atguigu.chapter1;


public class TestTypeTransfer{
    public static void main(String[] args) {
        byte b = 10;
        test(b);
    }


    public static void test(byte b) {
        System.out.println("bbbb");
    }

    public static void test(short s) {
        System.out.println("ssss");
    }

    public static void test(char c) {
        System.out.println("cccc");
    }

    public static void test(int i) {
        System.out.println("iiii");
    }


}
