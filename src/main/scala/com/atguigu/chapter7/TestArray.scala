package com.atguigu.chapter7

object TestArray {
  def main(args: Array[String]): Unit = {
    //1.数组定义
    val arr01 = new Array[Int](4)
    println(arr01.length)
    println("-----------------")

    //数组赋值
    //修改某个元素的值
    arr01(2) = 2
    arr01(1) = 1
    println(arr01.mkString(","))
    println("-----------------")
    //采用方法的形式给数组赋值
    arr01.update(0, 100)
    println(arr01.mkString(","))
    println("-----------------")

    //数组遍历
    //查看数组
    println(arr01.mkString(","))
    println("-----------------")
    //普通遍历
    for (i <- arr01) {
      println(i)
    }
    println("-----------------")

    //简化遍历
    def px(elem: Int): Unit = {
      println(elem)
    }
    println("-----------------")

    arr01.foreach(px)
    arr01.foreach((x) => {
      println(x)
    })
    println("-----------------")
    arr01.foreach(println(_))
    println("-----------------")
    arr01.foreach(println)

    //增加元素
    println("--------------")
    println(arr01)
    println("-----------------")
    //数组后面追加
    val ints: Array[Int] = arr01 :+ 5
    println(ints)
    println(arr01.mkString(","))
    println(ints.mkString(","))
    println("-----------------")

    //数组前面追加
    val ints2: Array[Int] = 5 +: arr01
    println(ints2.mkString(","))

    val ints3: Array[Int] = 6 +: ints
    println(ints3.mkString(","))
    println(ints3)

  }


}
