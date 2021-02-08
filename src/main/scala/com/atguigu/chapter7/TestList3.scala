package com.atguigu.chapter7

object TestList3 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4)

    //    1.获取集合长度
    println(list.length)
//    2.获取集合大小，等同于length
    println(list.size)
    list.foreach(println)

    for (e <- list) {
      println(e)
    }

    println(list.mkString(","))
    println(list.contains(3))


  }

}
