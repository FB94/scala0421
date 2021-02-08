package com.atguigu.chapter7

object TestList7 {
  def main(args: Array[String]): Unit = {

    val list1 = List(1, 2, 3, 4, 5, 6, 7)
    val list2 = List(4, 5, 6, 7, 8, 9, 10)

    //    1.获取集合的头
    println(list1.head)

    //    2.集合最后一个数据
    println(list1.last)

    //    3.集合的尾
    println(list1.tail)

    //    4.集合的初始数据
    println(list1.init)

    //    5.反转
    println(list1.reverse)

    //    6.取前、后几个元素
    println(list1.take(3))
    println(list1.takeRight(3))

    //    7.去掉前、后几个 元素
    println(list1.drop(3))
    println(list1.dropRight(3))

    //    8.并集
    println(list1.union(list2))

    //    9.差集
    println(list1.diff(list2))

    //    10.交集
    println(list1.intersect(list2))

    //    11.拉链 注:如果两个集合的元素个数不相等，那么会将同等数量的数据进行拉链，多余的数据省略不用
    println(list1.zip(list2))

    //    12.滑窗
    list1.sliding(2, 5).foreach(println)

  }
}
