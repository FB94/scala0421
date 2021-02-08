package com.atguigu.chapter8

object TestMatchVal {
  def main(args: Array[String]): Unit = {

    println(describe(5))

    def describe(x: Any) = x match {
      case 5 => "Int five"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
    }

  }
}
