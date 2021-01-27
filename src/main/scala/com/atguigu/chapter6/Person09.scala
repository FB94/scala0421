package com.atguigu.chapter6

abstract class Person09 {
  val name: String //抽象属性
  def hello(): Unit //抽象方法

}


class Teacher09 extends Person09 {
  val name: String = "teacher"

  def hello(): Unit = {
    println("hello teacher")
  }
}