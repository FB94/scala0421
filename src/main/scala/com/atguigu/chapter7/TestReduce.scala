package com.atguigu.chapter7

object TestReduce {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    val i : Int = list.reduce((x,y) => x-y)
    println(i)

    val i2 : Int = list.reduceRight((x,y)=>x-y)
    println(i2)

  }

}
