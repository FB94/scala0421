package com.atguigu.chapter7

object TestList8 {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val nestedList = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val wordList = List("Hello world", "Hello atguigu", "hello scala")

    //    1.过滤
    println(list.filter(x => x % 2 == 0))

    //    2.转换映射
    println(list.map(x => x + 1))

    //    3.扁平化
    println(nestedList.flatten)

    //    4.扁平化+映射 注：flatMap相当于先进行map操作，再进行flatten操作
    println(wordList.flatMap(x => x.split(" ")))

    //    5.分组
    println(list.groupBy(x=>x%2))


  }
}
