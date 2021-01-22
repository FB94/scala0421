package com.atguigu.chapter2

object TestType {
  def main(args: Array[String]): Unit = {
    //    00000000 00000000 00000000 10000010
    //    var n: Int = 128  //转换成-128
    var n: Int = 130 //转换成-126
    var b: Byte = n.toByte

    //    10000000 为当前字节范围最小值，约定-128
    //  负数补码：符号位不变，其他位按位取反 + 1
    println(b)
  }

}
