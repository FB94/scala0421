package com.atguigu.chapter5

object TestFunction03 {
  def main(args: Array[String]): Unit = {

    //    (1)调用foo函数，把返回值给变量f
    //    val f = foo()
    val f = foo
    println(f)

    //  (2)在被调用函数foo后面加上 _, 相当于把函数foo当成一个整体，传递给变量 f1
    val f1 = foo _

    foo()
    f1()

    //  (3)如果明确变量类型，那么不适用下划线也可以将函数作为整体传递给变量
    var f2: () => Int = foo

  }

  //  定义函数
  def foo(): Int = {
    println("foo....")
    1
  }
}
