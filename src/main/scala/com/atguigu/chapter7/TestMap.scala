package com.atguigu.chapter7

object TestMap {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map)

    //遍历
    map.foreach(println)
    map.foreach((kv) => {
      println(kv)
    })
    map.foreach((kv: (String, Int)) => println(kv))

    //访问数据
    for (elem <- map.keys) {
      println(elem + "=" + map.get(elem).get)
    }

    //访问具体数据
    println(map.get("a"))
    println(map.get("d"))
    //4.如果key不存在返回0
    println(map.get("d").getOrElse(0))
    println(map.getOrElse("d", 0))
  }

}
