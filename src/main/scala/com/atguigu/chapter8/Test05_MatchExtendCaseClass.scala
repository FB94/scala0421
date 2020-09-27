package com.atguigu.chapter8

//匹配样例类对象
object Test05_MatchExtendCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student02("bb", 22)
    val res = student match {
      case Student02("bb", 22) => "Yes"
      case _ => "No"
    }
    println(res)
  }
}

//定义样例类，底层直接自动生成伴生对象，并实现apply和unapply
case class Student02(name: String, age: Int)