package com.atguigu.chapter5

object TestFunctionDeclare {
  def main(args: Array[String]): Unit = {
    //1.无参，无返回值
    def t1():Unit={
      println("1.无参，无返回值")
    }
    t1()

    //2.无参，有返回值
    def t2():String ={
      return "2.无参，有返回值"
    }
    println(t2())

    //3.有参，无返回值
    def t3(s:String):Unit={
      println(s)
    }
    t3("t3")

    //4.有参，有返回值
    def t4(s:String):String={
      return s+"4.有参，有返回值"
    }
    println(t4("hello"))
    //5.多参，无返回值
    def t5(name:String,age:Int):Unit={
      println(s"$name,$age")
    }
    t5("monika",22)

  }

}
