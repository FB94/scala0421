package com.atguigu.chapter5

object TestFunction09 {
  def main(args: Array[String]): Unit = {
    //    编写程序实现如下内容：f(10)(20)()输出结果为200
    def f1(x: Int): Int => () => Int = {
      def f2(y: Int): () => Int = {
        def f3(): Int = {
          return x * y
        }

        f3 _
      }

      f2 _
    }
    //    println(f1(10)(20)())

    //    编写程序实现如下内容：f(10)(20)()输出结果为200

    def f4(x: Int): Int => ((Int, Int) => Int) => Int = {
      def f5(y: Int): ((Int, Int) => Int) => Int = {
        def f6(f: (Int, Int) => Int): Int = {
          f(x, y)
        }

        f6 _
      }

      f5 _
    }
    /*
    *   _*_是一个函数，所以f6参数应该定义为函数类型
    *   转换_*_为(a:Int,b:Int)=>(x*y)
    * */
    println(f4(10)(20)(_ * _))

  }
}
