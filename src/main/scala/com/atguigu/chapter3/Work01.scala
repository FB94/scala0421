package com.atguigu.chapter3

object Work01 {
  def main(args: Array[String]): Unit = {
    //打印金字塔
    for (i <- 1 to 9) {
      for (j <- 1 to (9 - i)) {
        print(" ") //遍历打印空格
      }
      for (j <- 1 to i * 2 - 1) {
        print("*") //遍历打印*
      }
      println()
    }

    println("---------------------------------")


    //第二种写法
    for (agent <- 1 to 9) {
      var num = agent * 2 - 1
      var mie = 9 - agent
      println(" " * mie + "❤" * num)
    }





  }
}
