package com.atguigu.chapter7

object TestSet {
  def main(args: Array[String]): Unit = {
    //    （1）Set默认是不可变集合，数据无序
    val set = Set(1, 2, 3, 4)
    println(set)

    //    （2）数据不可重复
    val set1 = Set(1, 2, 3, 1, 2, 3)
    println(set1)

    //    （3）遍历集合
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
