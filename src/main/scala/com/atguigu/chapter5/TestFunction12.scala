package com.atguigu.chapter5

object TestFunction12 {
  def main(args: Array[String]): Unit = {
    //    (1) 传递代码块
    foo({
      println("aaa")
    })

    //    (2) 小括号可以省略
    foo {
      println("bbb")
    }

  }

  def foo(a: => Unit): Unit = {
    println(a)
    println(a)
  }

}
