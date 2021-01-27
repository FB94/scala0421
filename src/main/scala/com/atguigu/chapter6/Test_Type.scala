package com.atguigu.chapter6

object Test_Type {
  def main(args: Array[String]): Unit = {
    type S = String;
    var v: S = "abc"

    def test(): S = "xyz"
  }

}
