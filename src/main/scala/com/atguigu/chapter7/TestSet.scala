package com.atguigu.chapter7

object TestSet {
  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3, 4)
    println(set)
    val set1 = Set(1, 2, 3, 1, 2, 3)
    println(set1)
    for (x <- set) {
      println(x)
    }
    val set2 = set1 + 4
    println(set2)
    val set3 = set2 - 4 + 6

    println(set3)
    val set4 = set2 ++ set3
    println(set4)

  }

}
