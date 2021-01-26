package com.atguigu.chapter5


object TestFunction01 {

  //  2.方法可以进行重载和重写，程序可以执行
  def main(): Unit = {}

  def main(args: Array[String]): Unit = {
    //  1.Scala语言可以在任何的语法结构中声明任何的语法
    import java.util.Date
    new Date()

    //  3.函数没有重载和重写的概念，程序报错
    def test(): Unit = {
      println("无参，无返回值")
    }

    test()

    def test1(name: String): Unit = {
      println()
    }

    //    4.Scala 中函数可以嵌套定义
    def test2() :Unit = {
      def test3(name:String):Unit={
        println("函数可以嵌套定义")
      }
    }
  }

}
