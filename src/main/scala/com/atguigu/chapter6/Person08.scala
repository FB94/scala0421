package com.atguigu.chapter6

class Person08(nameParam: String) {
  var name = nameParam
  var age: Int = _ // 给属性一个默认值

  def this(nameParam: String, ageParam: Int) {
    this(nameParam)
    this.age = ageParam
    println("父类辅助构造器")
  }

  println("父类主构造器")
}


class Emp(nameParam: String, ageParam: Int) extends Person08(nameParam, ageParam) {
  var empNo: Int = _

  def this(nameParam: String, ageParam: Int, empNoParam: Int) {
    this(nameParam, ageParam)
    this.empNo = empNoParam
    println("子类的辅助构造器")
  }

  println("子类的主构造器")
}


object Test01 {
  def main(args: Array[String]): Unit = {
    new Emp("z3",11,1001)
  }
}