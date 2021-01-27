package com.atguigu.chapter6

// (1)如果主构造器无参数，小括号可以省略
//class Person06() {
class Person06 {
  var name: String = _
  var age: Int = _

  def this(age: Int) {
    this()
    this.age = age
    println("辅助构造器")
  }

  def this(age: Int, name: String) {
    this(age)
    this.name = name
  }

  println("主构造器")
}

object Person06 {
  def main(args: Array[String]): Unit = {
    val person = new Person06(18)
  }
}



