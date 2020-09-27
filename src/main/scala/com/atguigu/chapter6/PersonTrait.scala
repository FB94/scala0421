package com.atguigu.chapter6

trait PersonTrait {
  //声明属性
  var name: String = _

  //声明方法
  def eat(): Unit = {}

  //声明属性
  var age: Int

  //抽象方法
  def say(): Unit
}

trait SexTrait {
  var sex: String
}

//2.一个类可以实现/继承多个特质
//3.所有的Java接口都可以当做Scala特质使用
class Teacher extends PersonTrait with java.io.Serializable {
  override def say() = {
    println("say")
  }

  override var age: Int = _
}

object TestTrait {
  def main(args: Array[String]): Unit = {
    val teacher = new Teacher
    teacher.say()
    teacher.eat()
  }
}

