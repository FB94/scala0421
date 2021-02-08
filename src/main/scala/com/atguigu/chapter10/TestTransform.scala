package com.atguigu.chapter10

import com.atguigu.chapter10.TestTransform.Teacher

//    2.如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。类型的作用域是指与该类型相关联全部伴生模块
object TestTransform extends PersonTrait {
  def main(args: Array[String]): Unit = {

//    1.首先会在当前代码作用域下查找隐式实体
    val teacher = new Teacher()
    teacher.eat()
    teacher.say()
  }


  class Teacher {
    def eat() = {
      println("eat...")
    }
  }
}

  trait PersonTrait {
  }

object PersonTrait {
  //隐式类：类型1=>类型2
  implicit class Person5(user: Teacher) {
    def say(): Unit = {
      println("say...")
    }
  }

}