package com.atguigu.chapter7

object HomeWork {
  def main(args: Array[String]): Unit = {
    val wordList: List[String] = List("china", "america", "alice", "canada", "japan")
    val groupMap2 = wordList.groupBy(_.head)
    //    println(groupMap2)


    //根据首字母进行分组
    //    val groupMap3 = wordList.groupBy(word => word.charAt(0))
    //补全
    val groupMap3: Map[Char, List[String]] = wordList.groupBy(_.charAt(0))
    println(groupMap3)

    val groupMap4: Map[Char, List[String]] = wordList.groupBy(_.head) //隐式转换 indexslink
    println(groupMap4)


  }

}
