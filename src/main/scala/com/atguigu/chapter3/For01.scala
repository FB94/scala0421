package com.atguigu.chapter3

object For01 {
  def main(args: Array[String]): Unit = {

    //    1.范围循环 To
    for (i <- 1 to 3)
      println("生如")
    println("to----------------------")


    //  2.范围循环 Unit
    for (i <- 1 until 3)
      println("夏花")
    println("until----------------------")


    //  3.循环守卫
    for (i <- 1 to 6) {
      if (i != 2) {
        println(i)
      }
    }
    println("!=----------------------")
    //    4.循环步长 by
    for (i <- 1 to 6 by 2)
      println(i)

    println("by----------------------")
    for (i <- -10 to -1 by 2)
      println(i)
    println("by----------------------")

    //    5.循环嵌套
    for (i <- 1 to 4; j <- 1 to 6) {
      print("i=" + i + ",j=" + j + "\t")
      if (j == 6)
        println()
    }
    println("嵌套----------------------")

    //  6.引入变量
    for (i <- 1 to 10; j = 10 - i) {
      println("i=" + i + ",j=" + j)
    }
    println("引入变量----------------------")


    for {
      i <- 1 to 3
      j = 3 - i
    } {
      println("i=" + i + ",j=" + j)
    }
    println("引入变量----------------------")


    //  7.循环返回值
    val res = for (i <- 1 to 10) yield i
    println(res)
    println("----------------------")

    //需求：将原数据中所有值乘以2，并把数据返回到一个新的集合中。
    var res1 = for (i <- 1 to 10) yield {
      i * 2
    }
    println(res1)
    println("循环返回值----------------------")

    //  8.倒序打印
    for (i <- 1 to 10 reverse) {
      println(i)
    }
    println("倒序----------------------")
  }

}
