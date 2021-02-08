package com.atguigu.chapter9;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;

        } catch (ArithmeticException e) {
            //catch时，需要将范围缩小的写到前面
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
