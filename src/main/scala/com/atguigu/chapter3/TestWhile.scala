package com.atguigu.chapter3

import scala.util.control.Breaks

object TestWhile {
  def main(args: Array[String]): Unit = {

    var i = 0
    while (i < 3) {
      println("水泥一般的天")
      i += 1
    }

    var o = 0
    do {
      println("橘色的屋顶")
      o += 1
    } while (o < 3)

    //  1.正常结束循环
    try {
      for (elem <- 1 to 10) {
        println(elem)
        if (elem == 5) throw new RuntimeException
      }
    } catch {
      case e =>
    }
    println("正常结束循环")
  }

  //  2.采用scala自带的函数，退出循环
  Breaks.breakable(
    for (e <- 1 to 5) {
      println(e)
      if (e == 5) Breaks.break()
    }
  )
  println("正常结束循环")

  //对break进行省略


}
