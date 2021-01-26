package com.atguigu.chapter5

object TestFunction10 {
  def main(args: Array[String]): Unit = {
    def f1()={
      var a:Int  = 10
      def f2(b:Int)={
        a+b
      }
      f2 _
    }
  }

}
