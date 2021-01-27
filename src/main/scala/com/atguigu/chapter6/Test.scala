package com.atguigu.chapter6

object Test_apply {
  def main(args: Array[String]): Unit = {
    //    (1) 通过伴生对象的apply方法，实现不使用new关键字创建对象。
    val p1 = Person_apply
  }
}

//  (2) 如果想让主构造器变成私有的，可以在()之前加上private
class Person_apply private(cName: String) {
  var name: String = cName

}

object Person_apply {
  def apply(): Person_apply = {
    println("apply空参被调用")
    new Person_apply("xx")
  }

  def apply(name: String): Person_apply = {
    println("apply有参被调用")
    new Person_apply(name)
  }

  //注意：也可以创建其它类型对象，并不一定是伴生类对象
}
