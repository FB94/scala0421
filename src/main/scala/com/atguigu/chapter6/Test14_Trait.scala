package com.atguigu.chapter6

object Test14_Trait {
  def main(args: Array[String]): Unit = {
    val myBall = new MyBall()
    println(myBall.describe()) //yellow-foot-ball
  }
}

//定义一个父特征
trait Ball {
  def describe(): String = "ball"
}

//定义子特征
trait Color extends Ball {
  var color: String = "yellow"

  override def describe(): String = color + "-" + super.describe()
}

trait Category extends Ball {
  var category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

//定义子类，继承两种特征
class MyBall extends Category with Color {
  override def describe(): String = "my ball is a " + super.describe()
}

