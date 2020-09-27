package com.atguigu.chapter7

import scala.collection.mutable.ListBuffer

object TestList2 {
  def main(args: Array[String]): Unit = {
    val buffer = ListBuffer(1, 2, 3, 4)
    val buffer2 = ListBuffer(1, 2, 3, 4)

    println(buffer)
    buffer.+=(5)
    println(buffer)
    buffer.append(6, 7)
    println(buffer)
    buffer.insert(0, 0, 0)
    println(buffer)
    buffer += 8 += 9
    println(buffer)
    10 +=: buffer
    println(buffer)

    buffer.foreach(println)

    buffer(1) = 11
    buffer.update(2, 22)
    println(buffer)

    println(buffer.-(5))

    println(buffer)
    buffer.-=(5)

    val buffer1 = buffer.remove(1)
    println(buffer1)

    val buffer3 = buffer ++ buffer2
    println(buffer3)

    buffer ++= buffer2
    println(buffer)



  }

}
