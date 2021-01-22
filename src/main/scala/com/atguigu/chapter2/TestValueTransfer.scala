package com.atguigu.chapter2

object TestValueTransfer {
  def main(args: Array[String]): Unit = {

    //（1）自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数值类型，然后再进行计算。
    var n = 1 + 2.2222
    println(n) //Double

    //（2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换。
    var n2: Double = 2.2222
    //    var n3: Int = n2 //报错

    //（3）（byte，short）和char之间不会相互自动转换。
    var n4: Byte = 44
    //    var c1 : Char = n4 //报错
    var n5: Int = n4

    //（4）byte，short，char他们三者可以计算，在计算时首先转换为int类型。
    var n6: Byte = 66
    var c2: Char = 22
    //    var n : Short = n6 + c2  //报错，结果是Int类型
    //    var n7 : Short = 10 + 20  //报错，byte，short，char他们三者可以计算，在计算时首先转换为int类型。

  }
}
