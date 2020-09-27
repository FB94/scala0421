package com.atguigu.chapter1

object Nothing {
  //1.Unit：空值（AnyVal），一般用于表示函数没有返回值，只有唯一的实例:()
  def main(args: Array[String]): Unit = {
    def m1(): Unit = {
      println("m1被调用执行")
    }

    println("Unit对象的返回值: " + m1())



    //2.Null：空引用(AnyRef)，表示没有引用任何的对象
    //  val a: Int = null //error,Int属于AnyVal，不能赋值null
    //  println(a)


  }
}
