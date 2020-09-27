package com.atguigu.chapter1

// object 定义了一个单例对象，有main方法，可以执行
/**
 * main 方法里
 * 方法名后面的小括号里是输入参数
 * 括号后面用冒号分割，是输出的数据类型。空的用Unit表示
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    System.out.println("Hello Jdk")
  }
}
