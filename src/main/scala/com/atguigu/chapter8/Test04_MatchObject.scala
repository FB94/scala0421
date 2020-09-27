package com.atguigu.chapter8

//匹配对象
object Test04_MatchObject {
  def main(args: Array[String]): Unit = {

    val student = new Student("ff", 23)

    //针对对象的属性值进行模式匹配
    val result = student match {
      case Student("ff", 23) => "Yes"
      case _ => "Not ff"
    }
    println(result)
  }
}

class Student(val name: String, val age: Int)

//伴生对象
object Student { //apply 方法
  //根据传入的属性参数，调用类的构造器创建对象
  def apply(name: String, age: Int): Student = new Student(name, age)

  //根据传入的对象，解析获取对象的所有属性（用来进行模式匹配）
  def unapply(student: Student): Option[(String, Int)] = { //空返回None，
    if (student == null)
      None
    else
      Some((student.name, student.age))
  }


}