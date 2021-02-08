package com.atguigu.chapter9

object TestImplicitParameter {
  implicit val str : String = "hello world"

  def hello(implicit arg :String = "good by world"):Unit = {
    println(arg)
  }

  def main(args: Array[String]): Unit = {
    hello
  }

}
