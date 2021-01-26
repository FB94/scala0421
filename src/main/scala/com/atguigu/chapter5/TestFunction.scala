package com.atguigu.chapter5





object TestFunction {
  def main(args: Array[String]): Unit = {

    def f(s: String): String = {
      return s + "f"
    }

    println(f("f"))
    println("-------------------")

    //1.return可以省略，scala会使用函数体的最后一行代码作为返回值
    def f1(s: String): String = {
      s + "f1"
    }

    println(f1("f1"))
    println("-------------------")

    //2.如果函数体只有一行代码，可以省略花括号
    def f2(s: String): String = s + "f2"

    println(f2("f2"))
    println("-------------------")

    //3.返回值类型如果能够推断出来，那么可以省略
    def f3(s: String) = s + "f3"

    println(f3("f3"))
    println("-------------------")

    //4.如果有return，则不能省略返回值类型，必须指定
    def f4(): String = {
      return "f4"
    }

    println(f4())
    println("-------------------")

    //5.如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
    def f5(): Unit = {
      return "f5"
    }

    println(f5())
    println("-------------------")

    //6.如果期望是无返回值类型，那么可以省略等号
    def f6(): Unit = {
      "f6"
    }

    println(f6())
    println("-------------------")

    //7.如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def f7() = "f7"

    println(f7())
    println(f7)
    println("-------------------")

    //8.如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8 = "f8"

    println(f8)
    println("-------------------")

    //9.
    def f9 = (str: String) => {
      println("f9")
    }

    println("-------------------")

    def f10(f: String => Unit) = {
      f("")
    }

    f10(f9)
    println(f10((str: String) => {
      println("f10")
    }))
    println("-------------------")


    def f11(fun: (String) => Unit): Unit = {
      println("调用别的函数，做为参数传入")
      fun("f11")
    }

    f11(f9)
    f11((x: String) => println(x))

    f11((x) => {
      println(x)
    })
    f11(x => {
      println(x)
    })
    f11(x => println(x))
    f11(println(_))
    f11(println)
  }

}
