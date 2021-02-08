package com.atguigu.chapter10

class Parent {}

class Child extends Parent {}

class SubChild extends Child {}


object Scala_TestGeneric {
  def main(args: Array[String]): Unit = {

  }

  //  泛型通配符上限

  def test[A >: Child](a: Class[A]): Unit = {
    println(a)
  }


  //  泛型通配符之下限
  def test[A >: Child](a: Class[A]): Unit = {
    println(a)
  }


  //泛型通配符之下限 形式扩展
  def test[A >: Child](a: A): Unit = {
    println(a.getClass.getName)

  }


}




