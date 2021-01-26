package com.atguigu.chapter5

// (1)闭包
object TestFunction10 {
  def main(args: Array[String]): Unit = {
    def f1() = {
      var a: Int = 10

      def f2(b: Int) = {
        a + b
      }

      f2 _
    }

    //    在调用时，f1函数执行完毕后，局部变量a应该随着栈空间释放掉
    val f = f1()
    //  但是在此处，变量a其实并没有释放，而是包含在了f2函数的内部，形成了闭合的效果
    println(f(3))
    println(f1()(3))

    //    函数柯里化，其实就是将复杂的参数逻辑变得简单化，函数柯里化一定存在闭包
    def f3()(b: Int) = {
      //      a+b
      b
    }

    println(f3()(3))

  }

}
