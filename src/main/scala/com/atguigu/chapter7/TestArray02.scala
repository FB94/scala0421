package com.atguigu.chapter7

object TestArray02 {
  def main(args: Array[String]): Unit = {
    var arr01 = Array(1, 3, 3, "bobo")
    println(arr01.length)
    //遍历
    for (i <- arr01) {
      println(i)
    }
    println(arr01)
  }

}
