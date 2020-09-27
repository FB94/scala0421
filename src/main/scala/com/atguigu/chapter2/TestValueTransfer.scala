package com.atguigu.chapter2

object TestValueTransfer {
  def main(args: Array[String]): Unit = {
    var n = 1 + 2.2222
    println(n) //Double

    var n2: Double = 2.2222
//    var n3: Int = n2 //报错

    var n4 : Byte = 44
//    var c1 : Char = n4 //报错
    var n5 : Int = n4

    var n6 : Byte = 66
    var c2 : Char = 22
//    var n : Short = n6 + c2  //报错，结果是Int类型
    var n7 : Short = 10 + 20 //报错，byte，short，char他们三者可以计算，在计算时首先转换为int类型。


  }

}
