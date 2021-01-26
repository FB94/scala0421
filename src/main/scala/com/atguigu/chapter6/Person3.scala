package com.atguigu.chapter6

class Person3 {


  private var name: String = "bobo"
  protected var age: Int = 18
  //  private[test] var sex: String = "男"

  def say(): Unit = {
    println(name)
  }
}

object Person3 {
  def main(args: Array[String]): Unit = {
    val person3 = new Person3
    person3.say()
    println(person3.name)

    //    println(person3.age) //报错
  }
}


class Teacher3 extends Person3 {
  def test(): Unit = {
    //    this.age
    //    this.sex
  }
}

class Animal {
  def test: Unit = {
    //    new Person3().sex
  }
}