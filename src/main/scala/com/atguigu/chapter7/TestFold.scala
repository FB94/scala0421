package com.atguigu.chapter7

import scala.collection.mutable

object TestFold {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    //    两个Map的数据合并
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 4, "b" -> 5, "d" -> 6)


    /*​// fold方法使用了函数柯里化，存在两个参数列表
​    // 第一个参数列表为 ： 零值（初始值）
​    // 第二个参数列表为： 简化规则
    * */
    // fold底层其实为foldLeft
    //    1-1-2-3-4
    val i = list.foldLeft(1)((x, y) => x - y)
    println(i)
    //    2-1-2-3-4
    val i2 = list.foldLeft(2)((x, y) => x - y)
    println(i2)

    //    10-(4-3-2-1)
    val i3 = list.foldRight(10)((x, y) => x - y)
    println(i3)

    val map3: mutable.Map[String, Int] = map2.foldLeft(map1) {
      (map, kv) => {
        val k = kv._1
        val v = kv._2
        map(k) = map.getOrElse(k, 0) + v
        map
      }
    }
    println(map3)


  }

}
