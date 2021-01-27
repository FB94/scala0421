package com.atguigu.chapter6

class Person14 {

}

object Person14 {
  def main(args: Array[String]): Unit = {
    val person = new Person14

    //    (1) 判断对象是否为某个类型的实例
    val bool: Boolean = person.isInstanceOf[Person14]
    if (bool) {
      //      (2) 将对象转换为某个类型的实例
      val p1: Person14 = person.asInstanceOf[Person14]
      println(p1)

      //      (3) 获取类的信息
      val pClass: Class[Person14] = classOf[Person14]
      println(pClass)
    }
  }
}
