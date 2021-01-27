package com.atguigu.chapter6

//  (1) 伴生对象采用object关键字声明
object Person_danli {
  var country: String = "China"
}

//  (2) 伴生对象对应的类称为伴生类，伴生对象的名称应该和伴生类名一致
class Person_danli {
  var name: String = "taotao"

}

object Test_danli {
  def main(args: Array[String]): Unit = {
    //    （3）伴生对象中的属性和方法都可以通过伴生对象名（类名）直接调用访问
    println(Person_danli.country)
  }
}