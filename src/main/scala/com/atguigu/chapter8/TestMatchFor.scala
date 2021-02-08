package com.atguigu.chapter8

object TestMatchFor {
  def main(args: Array[String]): Unit = {

    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)

    for ((k, v) <- map) { // 直接将map中的k-v遍历出来
      println(k + "->" + v)
    }
    println("---------")

    // 遍历value = 0 的k-v，如果v不是0，过滤
    for ((k, 0) <- map) {
      println(k + "-->" + 0)
    }

    println("----------")

    for ((k, v) <- map if v >= 1) {
      println(k + "-->" + v)
    }


  }
}
