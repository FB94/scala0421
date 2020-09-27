package com.atguigu.chapter7

object TestList {
  def main(args: Array[String]): Unit = {
    //1.List默认为不可变集合
    //2.创建一个List
    val list: List[Int] = List(1, 2, 3, 4)
    //3.遍历List
    list.foreach(println)
    println("---------")
    //4.List增加数据
    //4.1 ::的运算规则是从右向左
    val list1 = 5 :: list
    println(list1)
    println("-------")
    val list2 = 7 :: 6 :: list1
    println(list2)
    println("------------")
    //4.2添加到第一个元素位置
    val list3 = list.+:(0)
    println(list3)
    println("--------")

    //5.集合间的合并：将一个整体拆成一个一个的个体，成为扁平化
    val list4 = List(8, 9)
    println(list4)
    println("-------")
    val list5 = list4 ::: list1
    println(list5)
    println("------------")

    //6.取出指定数据
    println(list(2))
  }

}
