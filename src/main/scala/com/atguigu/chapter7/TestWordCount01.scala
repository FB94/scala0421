package com.atguigu.chapter7

object TestWordCount01 {
  def main(args: Array[String]): Unit = {

    //    第一种方式（不通用）
    val tupleList = List(("Hello Scala Spark Word", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    val stringList: List[String] = tupleList.map(t => (t._1 + " ") * t._2)
    println(stringList)

    val words: List[String] = stringList.flatMap(_.split(" "))
    println(words)

    //    在map中，如果传进来什么就返回什么，不要用 _ 省略
    val groupMap: Map[String, List[String]] = words.groupBy(word => word)
    println(groupMap)
    //    val groupMap1: Map[String, List[String]] = words.groupBy(_)

    //    (word, list) => (word, count)
    val wordToCount: Map[String, Int] = groupMap.map(t => (t._1, t._2.size))
    println(wordToCount)

    val wordCountList: List[(String, Int)] = wordToCount.toList.sortWith {
      (Left, Right) => {
        Left._2 < Right._2
      }
    }.take(3)

//    tupleList.map(t => (t._1 + " ") * t._2).flatMap(_.split(" ")).groupBy(word => word).map(t => (t._1, t._2.size))

    println(wordCountList)


  }

}
