package com.atguigu.chapter8

object TestMatchGuard {
  def main(args: Array[String]): Unit = {

    def abs(x: Int) = x match {
      case i: Int if i >= 0 => i
      case j: Int if j < 0 => -j
      case _ => "type illegal"

    }

    println(abs(-5))
  }
}
