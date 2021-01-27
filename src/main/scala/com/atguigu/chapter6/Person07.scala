package com.atguigu.chapter6


class Person07(name: String, var age: Int, val sex: String) {

}

object Test02 {
  def main(args: Array[String]): Unit = {
    var person = new Person07("taotao", 26, "女")

    //    （1）未用任何修饰符修饰，这个参数就是一个局部变量
    //        println(person.name)  //报错

    //    (2) var修饰参数，作为类的成员属性使用，可以修改
    person.age = 22
    println(person.age)


    //    （3）val修饰参数，作为类的只读属性使用，不能修改
    //    person.sex="男"
    println(person.sex)
  }
}





