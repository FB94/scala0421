package com.atguigu.chapter7

object DimArray {
  def main(args: Array[String]): Unit = {
    //1.创建一个二维数组，有三个元素，每个元素是，含有4个元素一堆数组()
    val arr = Array.ofDim[Int](5, 3)
    arr(1)(2) = 88
    println(arr)

    //2.遍历二维数组
    for (i <- arr) {  // i就是一堆数组
      for (j <- i) {
        println(j + " ")
      }
      println()
    }
  }

}
