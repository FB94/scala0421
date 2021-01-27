package com.atguigu.chapter6

abstract class Person13 {
  val name: String

  def hello(): Unit {
  }

  object Test13 {
    def main(args: Array[String]): Unit = {
      val person13: Person13 = new Person13 {

        override val name: String = "teacher"

        override def hello(): Unit = println("hello teacher")
      }
    }
  }

}
