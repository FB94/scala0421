package com.atguigu.chapter1

object TestCharType2 {
  def main(args: Array[String]): Unit = {
    var c1: Char = 'a'
    println("c1=" + c1)

    var c2:Char = 'a' + 1
    println(c2)

    println("姓名\t年龄")
    println("西门庆\n潘金莲")
    println("c:\\天黑了\\饿狼来了")
    println("你过来：\"看我一拳打死你\"")
  }

}
