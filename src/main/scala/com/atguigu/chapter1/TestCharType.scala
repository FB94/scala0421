package com.atguigu.chapter1

object TestCharType {
  def main(args: Array[String]): Unit = {
    var name: String = "wuwuwu"
    var age: Int = 10

    //1.字符串 通过 + 号连接
    println(name + " " + age)

    //2.printf 用法字符串，通过%传值
    printf("name=%s age=%d\n", name, age)

    //3.字符串，通过$引用
    val s =
      """
    | select
    | name
    |,
    |age
    |from user
    |where name = "zhangsan"
    """.stripMargin
    println(s)

    //
    val s1 =
      s"""
        | select
        | name
        |,
        |age
        |from user
        |where name="$name" and age=${age+2}
    """.stripMargin
    val s2 = s"name=$name"
    println(s2)
  }
}
