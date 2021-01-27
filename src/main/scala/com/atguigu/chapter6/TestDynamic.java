package com.atguigu.chapter6;

class Person11 {
    public String name = "person";

    public void hello() {
        System.out.println("hello person");
    }

}

class Teacher11 extends Person11 {
    public String name = "teacher";

    @Override
    public void hello() {
        System.out.println("hello teacher");
    }
}

public class TestDynamic {
    public static void main(String[] args) {
        Teacher11 teacher11 = new Teacher11();
        Person11 teacher111 = new Teacher11();
        System.out.println(teacher11.name);
        teacher11.hello();

        System.out.println(teacher111.name);
        teacher111.hello();
    }

}


