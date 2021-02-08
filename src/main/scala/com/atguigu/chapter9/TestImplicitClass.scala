package com.atguigu.chapter9

object TestImplicitClass {

  implicit class MyRichInt(arg: Int) {

    def myMax(i: Int): Int = {
      if (arg < i) i else arg
    }

    def myMin(i: Int): Int = {
      if (arg < i) arg else i
    }
  }

  def main(args: Array[String]): Unit = {
    println(1.myMax(3))
  }

}
