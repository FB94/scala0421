package com.atguigu.chapter8

object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {
    //偏函数的转变
    //例子：处理一个list，key不变，value乘以2
    val list = List(("a", 1), ("b", 2))
    //常规处理；Map转换，传入一个匿名函数
    val list2 = list.map(t => (t._1, t._2 * 2)) //t表示一个元组

    //用模式转换，实现直接定义k,v的功能
    val newList1 = list.map(t => t match {
      case (k, v) => (k, v * 2)
    })

    //上面的简化为下面：偏函数
    //元组t作为参数可以省略，但{}不能省略，如果只有一个参数加{}，外面的（）可以省略
    val newList2 = list.map {
      case (k, v) => (k, v * 2)
    }

    //偏函数的应用，求一个整数的绝对值
    //定义求绝对值的各个部分函数（针对某一种输入情况的处理）
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val zero: PartialFunction[Int, Int] = {
      case x if x == 0 => 0
    }
    val negetiveAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }

    //偏函数构成完整函数
    def myAbs(x: Int): Int = {
      (positiveAbs orElse zero orElse negetiveAbs) (x)
    }

    println(myAbs(-1))
    println(myAbs(0))
    println(myAbs(1))


  }

}
