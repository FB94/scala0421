package com.atguigu.chapter7

import scala.collection.mutable

object TestSet2 {
  def main(args: Array[String]): Unit = {
    val set = mutable.Set(1, 2, 3, 4)
    val set1 = mutable.Set(5, 6)

    println(set)
    for (e <- set) {
      println(e)
    }
    set.foreach(println)

    set += 5 += 6
    set.add(7)
    val flag1: Boolean = set.add(7)
    println(flag1)
    println(set)

    val ints = set.+(8)
    println(ints)
    println(set)

    set -= 5
    println(set)
    set.remove(4)


    //合并两个set
    val set3 = set ++ set1
//    println(set3)
    set1 ++= set
//    println(set1)
//    println(set)
//
    println("set="+set)

    println("set1="+set1)
    //set 并集
    println(set.union(set1))

    println(set.intersect(set1))
  }

}
