package com.atguigu.chapter7

import scala.collection.mutable.ArrayBuffer

object TestArrayBuffer2 {
  def main(args: Array[String]): Unit = {
    //1.创建一个空的可变数组
    val arr1 = ArrayBuffer[Int]()

    //2.追加值
    arr1.append(0, 1, 2, 3)
    println(arr1)

    //3.可变数组转换成不可变数组
    //3.1 arr2.toArray返回的结果是一个新的定长数组集合
    //arr1 没有变化
    val newArr = arr1.toArray
    println(newArr)
    println(newArr.mkString(","))

    //4.不可变数组转换成可变数组
    //4.1 newArr.toBuffer 返回一个变长数组 newArr2
    //4.2 newArr没有任何变化，依然是定长数组
    val newArr2 = newArr.toBuffer
    println(newArr2)
    println(newArr2.mkString(","))
    newArr2.append(4, 5)
    println(newArr2.mkString(","))
    println(newArr) //定长数组
    println(newArr2)


  }
}
