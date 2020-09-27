package com.atguigu.chapter1

object TestSpeciaType {

  def main(args: Array[String]): Unit = {

    def test() : Nothing={
      throw new Exception()
    }
    test
  }


}
