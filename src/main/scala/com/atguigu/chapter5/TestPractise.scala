package com.atguigu.chapter5

object TestPractise {
  def main(args: Array[String]): Unit = {
    val fun: (Int, String, Char) =>
      Boolean = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(fun(0, "", '0'))
    println(fun(0, "hello", '0'))

    println("-------------------------------")
    //简化
    val fun1 = (i: Int, s: String, c: Char) => !(i == 0 && s == "" && c == '0')
    println(fun1(0, "", '0'))
    println(fun1(0, "hello", '0'))
    println(fun1(0, "ff", 2))


    println("-------------------")

    //2.实现一个高阶函数，返回值是函数，嵌套三个函数，最终返回Boolean
    //要求func(0)("")('0')的返回值为false，其他情况为true
    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = !(i == 0 && s == "" && c == '0')

        f2 //返回
      }

      f1 //返回
    }

    //用lambda表达式进行简写
    def func1(i: Int): String => (Char => Boolean) = {
      (s: String) => (c: Char) => !(i == 0 && s == "" && c == '0')
    }

    println(func(0)("")('0'))
    println(func(0)("")('f'))
    println(func1(0)("")('0'))
    println(func1(0)("")('4'))


  }


}
