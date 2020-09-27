package com.atguigu.chapter7

object TestPar {

  def main(args: Array[String]): Unit = {

    val result1 = (0 to 100).map { case _ => Thread.currentThread.getName }
    val result2 = (0 to 100).par.map { case _ => Thread.currentThread.getName }

    println(result1) //只有一个线程 串行
    println("--------------------")
    println(result2) //并行
  }
}

