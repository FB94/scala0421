package com.atguigu.chapter1

object TestSpecialType {
  def main(args: Array[String]): Unit = {
    def sayOk: Unit = { // unit 表示没有返回值，即void
    }

    println(sayOk)

    def test(): Nothing = {
      throw new Exception
    }

    test()
  }
}
