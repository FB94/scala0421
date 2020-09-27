package com.atguigu.chapter2

object TestForceTransfer {
  def main(args: Array[String]): Unit = {
    var n1 : Int = 1.22.toInt
    println(n1)

    var r1:Int = 10*1.7.toInt + 2*2.55.toInt // 10*1 + 2*2
    println(r1)
    var r2:Int = (10*1.6 + 2*2.5).toInt //21.0.toInt = 21
    println(r2)

  }
}
