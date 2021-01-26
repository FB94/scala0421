package com.atguigu.chapter6

import scala.beans.BeanProperty

class Persion2 {
  var name: String = "bobo" //定义属性
  var age: Int = _ //_表示给属性一个默认值

  //  Bean属性（@BeanProperty）
  @BeanProperty var sex: String = "男"
  //  val 修饰的属性不能赋默认值，必须显示指定


}

object Persion2 {
  def main(args: Array[String]): Unit = {
    var persion2 = new Persion2()
    println(persion2.name)

    persion2.setSex("女")
    println(persion2.getSex)
  }
}

