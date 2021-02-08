package com.atguigu.chapter9

object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val a = 22 / 0
    } catch {
      case e: ArithmeticException => {
        println("算术异常")
      } //算术异常
      case e: Exception => {
        println("其他异常")
      }
    } finally {
      println("运行结束")


    }
  }
}
