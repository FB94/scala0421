package com.atguigu.chapter8

class User(val name: String, val age: Int)

object User {

  def apply(name: String, age: Int): User = new User(name, age)

  def unapply(user: User): Option[(String, Int)] = {
    if (user == null)
      None
    else
      Some(user.name, user.age)
  }
}


object TestMatchUnapply {
  def main(args: Array[String]): Unit = {
    val user: User = User("zhangsan", 11)
    val result = user match {
      case User("zhangsan", 11) => "yes"
      case _ => "no"
    }

    println(result)
  }
}
