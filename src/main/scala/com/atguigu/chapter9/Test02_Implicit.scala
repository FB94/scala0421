package com.atguigu.chapter9

object Test02_Implicit {
  def main(args: Array[String]): Unit = {
    //隐式函数
    implicit def transform(num: Int): MyRichInt = {
      new MyRichInt(num)
    }

    println(12.MyMax(5))
    println(12.MyMin(5))

    //2.隐式函数
    implicit val str:String = "bb"

    def hello(implicit param: String = "ff") = {
      println(param)
    }

    hello("bb")
    hello()
    hello //调用时可以不传参，自动寻找环境中相同类型隐式变量的定义

  }

}

class MyRichInt(val self: Int) {
  def MyMax(i: Int): Int = {
    if (self < i) i else self
  }

  def MyMin(i: Int): Int = {
    if (self > i) i else i
  }

}