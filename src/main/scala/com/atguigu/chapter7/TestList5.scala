package com.atguigu.chapter7

object TestList5 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 5, -3, 4, 2, -7, 6)
    println(list.sum)

    println(list.product)

    println(list.max)
    println(list.min)

    println(list.sortBy(x =>x))
    println(list.sortBy(x=>x.abs))
    println(list.sortWith((x,y)=>x<y))
    println(list.sortWith((x,y)=>x>y))
  }

}
