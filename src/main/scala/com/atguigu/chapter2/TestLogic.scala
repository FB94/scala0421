package com.atguigu.chapter2

object TestLogic {
  def main(args: Array[String]): Unit = {
    var a = true
    var b = false

    println("a&&b=" + (a && b)) //false
    println("a||b=" + (a || b)) //true
    println("!(a&&b)=" + (!(a && b))) //true
  }
}

