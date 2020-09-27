package com.atguigu.chapter6

object Test12_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student12

    student.sayHello()
    student.study()
    student.play()
    student.dating()

  }
}

//先定义父类
class Person12 {
  var name: String = "person"
  var age: Int = 20

  def sayHello() = {
    println("hello person" + name)
  }
}

//定义一个特征
trait Young {
  //抽象属性，没有赋值
  var age: Int

  //声明一个具体有实现方法
  def play(): Unit = println("年轻人打游戏")

  //声明抽象方法
  def dating(): Unit
}

//定义子类,继承特征
class Student12 extends Person12 with Young { //Student12需要实现Young的方法
  name = "飞哥"
  age = 12
  var Id: String = _

  override def sayHello(): Unit = println("学生叫什么：" + name) //父类

  def study() = println(name + "在学习") //自己的

  override def dating(): Unit = println("年轻人爱约会") //特征
}

//可以单独继承一个特征
//class StudentTest extends Young {
//  Override
//  var age: Int
//  = 22
//  override def dating(): Unit = println("年轻人呀")
//}