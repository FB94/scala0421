package com.atguigu.chapter5

object TestFunction14 {
  def main(args: Array[String]): Unit = {

    lazy val res = sum(10, 30)
    println("-----------")
    println("res=" + res)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum被执行")
    return n1 + n2
  }

}
