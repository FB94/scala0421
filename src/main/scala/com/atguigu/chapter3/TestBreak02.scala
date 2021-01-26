package com.atguigu.chapter3

//循环遍历10以内的所有数据，奇数打印，偶数跳过（continue）

object TestBreak02 {
  def main(args: Array[String]): Unit = {
    for (elem <- 1 to 10) {
      if (elem % 2 == 1){
        println(elem)
      }else{
        println("continue")
      }
    }
  }
}
