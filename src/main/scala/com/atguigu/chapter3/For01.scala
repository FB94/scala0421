package com.atguigu.chapter3

object For01 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3)
      println("生如")
    for (i <- 1 until 3)
      println("夏花")
    for (i <- 1 to 6 by 2)
      println(i)

    for (i <- 1 to 6) {
      if (i != 2) {
        println(i)
      }
    }

    for (i <- -10 to -1 by 2)
      println(i)

    for (i <- 1 to 4; j <- 1 to 6) {
      print("i=" + i + ",j=" + j + "\t")
      if (j == 6)
        println()
    }

    //8.引入变量
    for (i <- 1 to 10; j = 10 - i) {
      println("i=" + i + ",j=" + j)
    }

    for {
      i <- 1 to 3
      j = 3 - i
    } {
      println("i=" + i + ",j=" + j)
    }


    //9.循环返回值
    val res = for (i <- 1 to 10) yield i
    println(res)
    //需求：将原数据中所有值乘以2，并把数据返回到一个新的集合中。
    var res1 = for(i <- 1 to 10) yield {
      i *2
    }
    println(res1)

    //倒序打印
    for(i <- 1 to 10 reverse) {
      println(i)
    }
  }

}
