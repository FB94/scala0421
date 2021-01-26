package com.atguigu.chapter2

object TestRelationScala {
  def main(args: Array[String]): Unit = {
    val s1 = "aaa"
    val s2 = new String("aaa")

    println(s1 == s2) //  true
    println(s1.eq(s2))   // false
  }
}
