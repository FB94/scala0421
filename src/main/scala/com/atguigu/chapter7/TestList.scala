package com.atguigu.chapter7

object TestList {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    list.foreach(println)
    println("--------------")

    val list1 = 5 :: list
    println(list1)
    println("--------------")

    val list2 = 7 :: 6 :: list1
    println(list2)
    println("--------------")


    val list3 = list.+:(0)
    println(list3)
    println("--------------")

    val list4 = List(8, 9)
    println(list4)
    println("--------------")
    val list5 = list4 ::: list1
    println(list5)
    println("--------------")


    println(list(2))

  }
}
