package com.atguigu.chapter5

object HigherOrderFun {
  def main(args: Array[String]): Unit = {
    //0.简单函数声明与调用
    def f0(): Int = {
      println("f0()..")
      10
    }
    //调用
    f0()
    //获取函数的返回值进一步计算
    var res: Int = f0 //函数的调用
    println(res)

    //1.函数可以做为值进行进一步计算
    val f1: () => Int = f0 _ //将f0做为整体
    def f2: () => Int = f0 _ //
    val f3 = f0 _

    println("------------------------")
    //直接调用的话，就是f1调用的返回值，就是一个函数的内存地址
    println(f1) //相当于函数调用，com.atguigu.chapter5.HigherOrderFun$$$Lambda$5/532445947@45c8e616
    println(f1()) //调用了一次f0的调用
    println("---------------")
    println(f2) //相当于函数调用，com.atguigu.chapter5.HigherOrderFun$$$Lambda$6/1289479439@66d33a
    println(f2())
    println("--------------------")
    println(f3)
    println(f3())
    println("---------------------")
    println(f1 == f2)
    println(f1 == f3)
    println("-------------------")

    //有参数的情况
    def f(a: Int): Int = a

    val f4: Int => Int = f //f _ 和 前面指定类型是一个函数，都是一个函数体
    println(f4)
    println(f4(11))

    println("------------------------")

    //2.函数作为参数进行传参
    //操作数也作为参数传入的通用二元计算函数
    def dualEval(a: Int, b: Int, op: (Int, Int) => Int): Int = {
      op(a, b)
    }

    //定义一个两数求和函数
    def add(a: Int, b: Int) = a + b

    println(dualEval(12, 11, add)) //通用计算方法传入函数本身 add
    println(dualEval(11, 11, _ - _)) //把匿名函数传入做减法 _-_

    println("--------------------")

    //3.函数作为返回值进行返回
    //函数的嵌套
    def f5(): () => Unit = {
      //在函数内另外定义函数，并将函数体返回
      def f6(): Unit = {
        println("f6()...")
      }

      f6 //省略()是一个调用，前面有类型推断，可以不加_

    }

    //调用
    val f7 = f5() //得到的f7就相当于f5的函数f6，并没有任何输出，只是f5的返回体
    f7()
    f5()() //调用f6的方式
  }
}
