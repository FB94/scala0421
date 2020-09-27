package com.atguigu.chapter7

object TestList3 {
  def main(args: Array[String]): Unit = {
    val list:List[Int] = List(1,2,3,4)

    println(list.length)
    println(list.size)
    list.foreach(println)

    for(e <- list) {
      println(e)
    }

    println(list.mkString(","))
    println(list.contains(3))


  }

}
