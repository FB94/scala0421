package com.atguigu.chapter6

class Person10 {
  val name: String = "person"

  def hello(): Unit = {
    println("hello person")
  }
}

class Teacher10 extends Person10 {

  override val name: String = "teacher"

  override def hello(): Unit = {
    println("hello teacher")
  }

}

object Test10 {
  def main(args: Array[String]): Unit = {
    val teacher10 = new Teacher10()
    println(teacher10.name)
    teacher10.hello()

    val teacher101: Person10 = new Teacher10
    println(teacher101.name)
    teacher101.hello()
  }
}