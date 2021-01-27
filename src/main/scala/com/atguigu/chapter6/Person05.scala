package com.atguigu.chapter6

class Person05 {
  var name: String = "taotao"
}

object Person05 {
  def main(args: Array[String]): Unit = {
    //    val 修饰对象，不能改变对象的引用（即内存地址），可以改变对象属性的值。
    val person = new Person05()
    person.name = "bingbing"

    //person = new Person05() //错误
    println(person.name)
  }
}
