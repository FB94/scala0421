package com.atguigu.chapter8

object TestMatchPartial {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5, 6, "test")
    val list1: List[Any] = list.map {
      a =>
        a match {
          case int: Int => int + 1
          case string: String => string + 1
        }
    }
    println(list1.filter(a => a.isInstanceOf[Int]))


    //方法一
    List(1, 2, 3, 4, 5, 6, "test").filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int] + 1).foreach(println)

    //方法二
    List(1, 2, 3, 4, 5, 6, "test").collect { case x: Int => x + 1 }.foreach(println)

  }
}

