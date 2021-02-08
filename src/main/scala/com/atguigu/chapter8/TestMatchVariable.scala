package com.atguigu.chapter8

case class Person(name: String, age: Int)

object TestMatchVariable {
  def main(args: Array[String]): Unit = {
    val (x, y) = (1, 2)
    println(s"x=x,y=y")

    val Array(first, second, _*) = Array(1, 7, 2, 9)
    println(s"first=first,second=second")


    val Person(name, age) = Person("zhangsan", 16)
    println(s"name=name,age=age")
  }

}
