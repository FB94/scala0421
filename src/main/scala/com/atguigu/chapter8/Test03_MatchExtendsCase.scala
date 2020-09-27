package com.atguigu.chapter8

object Test03_MatchExtendsCase {
  def main(args: Array[String]): Unit = {
    //声明变量是，可以用元组、集合、样例类形式同时对里面的多个元素直接声明
    var (x, y) = (1, 2)
    println(x, y)

    val (stdId, name, age) = (11, "ff", "33")
    val List(first, second, _*) = List(11, 22, 33, 44)
    println(first, second)

    //2.for推导式里的模式匹配
    val list: List[(String, Int)] = List(("a", 1), ("b", 2))
    println(list)
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2)

    for (elem <- list) {
      println("k:" + elem._1 + ",v:" + elem._2)
    }

    for ((w, c) <- list) println("k:" + w + ",v:" + c)

    for ((word, _) <- list) println("k:" + word)
    for (("a", c) <- list) println("a的value：" + c) //key=a

  }

}
