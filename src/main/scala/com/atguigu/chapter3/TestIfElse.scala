package com.atguigu.chapter3

import scala.io.StdIn

object TestIfElse {
  def main(args: Array[String]): Unit = {

    // Scala
    println("input age:")
    var age = StdIn.readShort()
    val res: Any = if (age < 18) {
      "童年"
    } else {
      if (age >= 18 && age < 30) {
        "中年"
      } else {
        "老年"
      }
    }

    println(res)
  }
}
