package com.atguigu.chapter2

object TestStringTransfer {
  def main(args: Array[String]): Unit = {
    var str1: String = true + "你好无聊"
    println(str1)

    var str2 : String = 4.444 + "拜拜"
    println(str2)

    var str3 : String = 4444 + ""
    println(str3)

    var s1 : String = "11"
    var n1:Byte = s1.toByte
    var n2:Short = s1.toShort
    var n3:Int = s1.toInt
    var n4:Long = s1.toLong
    println(s1)
    println(n1)
    println(n2)
    println(n3)
    println(n4)
  }
}