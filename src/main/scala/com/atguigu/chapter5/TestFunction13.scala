package com.atguigu.chapter5

//自定义一个While循环
object TestFunction13 {
  def main(args: Array[String]): Unit = {
    var i: Int = 1
    myWhile(i <= 10) {
      println(i)
      i +=1
    }
  }

  def myWhile(condition: => Boolean)(op: => Unit): Unit = {
    if (condition) {
      op
      myWhile(condition)(op)
    }
  }

}
