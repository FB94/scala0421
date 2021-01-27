package com.atguigu.chapter6

//方法
class Person04 {
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}

object Person04 {
  def main(args: Array[String]): Unit = {
    val person = new Person04()
    println(person.sum(10, 20))
  }
}
