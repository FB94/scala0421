package com.atguigu.chapter3

object TestWhile02 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      for (j <- 1 to i) {
        print(j + "*" + i + "=" + (i * j) + "\t")
      }

      println()
    }
  }
}
