package com.atguigu.chapter7

object TestReduce {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    //    1. 将数据两两结合，实现运算规则
    val i: Int = list.reduce((x, y) => x - y)
    // 1-2-3-4
    println("i=" + i)

    //    2.从源码的角度，reduce底层调用的其实就是reduceLeft
    val i1: Int = list.reduceLeft((x, y) => x - y)
    println(i1)

    //    ((4-3)-2-1)
    val i2: Int = list.reduceRight((x, y) => x - y)
    println(i2)

  }

}
