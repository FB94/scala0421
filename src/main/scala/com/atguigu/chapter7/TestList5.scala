package com.atguigu.chapter7

object TestList5 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 5, -3, 4, 2, -7, 6)

//    1.求和
    println(list.sum)

//    2.求乘积
    println(list.product)

//    3.最大值
    println(list.max)

//    4.最小值
    println(list.min)

//    5.排序
//    5.1按照元素大小排序
    println(list.sortBy(x => x))

//    5.2按照元素的绝对值大小排序
    println(list.sortBy(x => x.abs))

//    5.3按照元素大小升序排序
    println(list.sortWith((x, y) => x < y))

//    5.4按元素大小降序排序
    println(list.sortWith((x, y) => x > y))
  }
}
