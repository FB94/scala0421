package com.atguigu.chapter6

object Test13_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student = new Student13
    student.sayHello()
    student.study()
    student.knowledgeIncrese()
    student.play()
    student.dating()
    student.knowledgeIncrese()

    //特征的动态混入：创建对象的时候，直接为当前对象添加新的特质
    val student1 = new Student13 with Super {
      override def flay(): Unit =
        "飞的真高"
    }
    println(student1.dating + "," + student1.flay)
  }
}

//再定义一个特征：自带天赋
trait Super {
  def flay(): Unit
}

//再定义一个特征：知识量
trait Konwledge {
  def knowledgeIncrese(): Unit //抽象方法
  def play(): Unit = println("playing knowledge")

}

//重新定义Student,特征增加一个Knowledge
class Student13 extends Person12 with Young with Konwledge {
  name = "飞哥"
  age = 12
  var Id: String = _

  override def sayHello(): Unit = println("学生叫什么：" + name) //父类
  def study() = println(name + "在学习") //自己的
  override def dating(): Unit = println("年轻人爱约会") //Young特征
  override def knowledgeIncrese(): Unit = println(name + "学到知识了")

  override def play(): Unit = println("自己的play")
}
