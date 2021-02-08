package com.atguigu.chapter7

object        TestList4 {
  def main(args: Array[String]): Unit = {
    val list1: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
    val list2: List[Int] = List(4, 5, 6, 7, 8, 9, 10,11)

    println(list1.head)

    println(list1.tail)

    println(list1.last)
    println(list1.init)
    println(list1.reverse)
    println(list1)
    println(list1.take(5))
    println(list1.takeRight(4))
    println(list1.drop(3))
    println(list1.dropRight(4))

    println(list1.union(list2))
    println(list1.intersect(list2))

    println(list1.diff(list2))
    println(list1.zip(list2))

    list1.sliding(2).foreach(println)
    list1.sliding(5).foreach(println)
    println("----------")
    list1.sliding(3,3).foreach(println)

  }

}
