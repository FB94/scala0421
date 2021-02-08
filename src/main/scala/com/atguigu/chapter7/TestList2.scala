package com.atguigu.chapter7

import scala.collection.mutable.ListBuffer

object TestList2 {
  def main(args: Array[String]): Unit = {
    //    1.创建一个可变集合
    val buffer = ListBuffer(1, 2, 3, 4)
    val buffer2 = ListBuffer(1, 2, 3, 4)
    println(buffer)

    //    2.向集合中添加数据
    buffer.+=(5)
    println(buffer)
    println("----------")

    buffer.append(6, 7)
    println(buffer)
    println("----------")


    buffer.insert(0, 0, 0)
    println(buffer)

    buffer += 8 += 9
    println(buffer)
    println("----------")

    10 +=: buffer
    println(buffer)
    println("----------")

    buffer.foreach(println)
    println("----------")


    buffer(1) = 11
    buffer.update(2, 22)
    println(buffer)
    println("----------")

    println(buffer.-(5))
    println("----------")

    println(buffer)
    buffer.-=(5)
    println("----------")

    val buffer1 = buffer.remove(1)
    println(buffer1)

    val buffer3 = buffer ++ buffer2
    println(buffer3)

    buffer ++= buffer2
    println(buffer)


  }

}
