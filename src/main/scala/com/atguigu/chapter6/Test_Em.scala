package com.atguigu.chapter6

object Test_Em {
  def main(args: Array[String]): Unit = {
    println(ColorEm.RED)
  }

}

//枚举类
object ColorEm extends Enumeration {
  val RED = Value(1, "red")
  val YELLOW = Value(2, "yellow")
  val BLUE = Value(3, "blue")
}

//应用类
object TestApp extends App {
  println("xxxxx")
}