package com.atguigu.chapter7

import scala.collection.mutable.ArrayBuffer

object TestArrayBuffer {
  def main(args: Array[String]): Unit = {
    //1.创建并初始赋值可变数组
    var arr01 = ArrayBuffer[Any](1, 2, 3)
    //2.遍历数组
    for (i <- arr01) {
      println(i)
    }
    println(arr01.length)
    println("arr01.hash=" + arr01.hashCode())

    //3.增加元素
    //追加元素
    arr01.+=(5)
    println("arr01.hash=" + arr01.hashCode())
    println(arr01)

    //向数组最后追加数据
    arr01.append(33, 44)
    println("arr01.hash=" + arr01.hashCode())
    println(arr01)
    //修改元素
    arr01(3) = 4
    println(arr01)

  }

}
