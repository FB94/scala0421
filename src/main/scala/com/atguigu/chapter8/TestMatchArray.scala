package com.atguigu.chapter8

object TestMatchArray {
  def main(args: Array[String]): Unit = {

    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0, 1), Array("hello", 90))) { //对一个数据集合进行遍历

      val result = arr match {
        case Array(0) => "0" // 匹配Array(0) 这个数组
        case Array(x, y) => x + "," + y // 配置有两个元素的数组，然后将元素赋值给对应的x,y
        case Array(0, _*) => "以0开头的数组" // 匹配以0开头的数组
        case _ => "something else"
      }

      println("result=" + result)

    }
  }
}
