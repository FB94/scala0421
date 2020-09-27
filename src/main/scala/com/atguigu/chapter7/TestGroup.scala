package com.atguigu.chapter7

object TestGroup {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")

    println(list.filter(x => x%2 == 0))

    println(list.map(x => x+1))

    println(nestedList.flatten)

    println(list.groupBy(x => x % 2))
    val groupMap : Map[Int,List[Int]] = list.groupBy(_ %2)
    println(groupMap)
  }

}
