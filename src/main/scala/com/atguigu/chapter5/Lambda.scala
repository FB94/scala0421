package com.atguigu.chapter5

object Lambda {
  def main(args: Array[String]): Unit = {
    //简单的两数求和函数
    def add2(a: Int, b: Int) = a + b

    //定义一个二元运算函数，接收一个二元函数做为参数，固定操作的两个数
    def dualFunOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }
    //    dualFunOneAndTwo(add2)
    println(dualFunOneAndTwo(add2))

    //lambda表达式写法
    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b
    println(dualFunOneAndTwo(minus))
    println(dualFunOneAndTwo(add))

    //可以直接把lambda表达式做为dualFun的参数
    println(dualFunOneAndTwo((a: Int, b: Int) => a + b))
    println(dualFunOneAndTwo((a, b) => a + b))
    println(dualFunOneAndTwo(_ + _))
    println(dualFunOneAndTwo(_ - _))
  }
}
