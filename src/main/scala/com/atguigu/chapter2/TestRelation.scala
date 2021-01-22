package com.atguigu.chapter2

object TestRelation {
  def main(args: Array[String]): Unit = {
    var s1 = "hhhh"
    var s2 = new String("hhhh")
    println(s1 == s2)
    println(s1.eq(s2))


    // 测试：>、>=、<=、<、==、!=

    ​ var a: Int = 2
    ​ var b: Int = 1

    ​ println(a > b) // true
    ​ println(a >= b) // true
    ​ println(a <= b) // false
    ​ println(a < b) // false
    ​ println("a==b" + (a == b)) // false
    ​ println(a != b) // true

  }
}
