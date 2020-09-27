package com.atguigu.chapter6


//特征自身类型，表示自己的子类型也必须是相应的类型
//产生的效果相当于继承或者混入(mixin)
object Test15_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new MyUser("ff", 22)
    user.insert()

  }
}

//定义User类，作为trait的自身类型
class User(var name: String, var age: Int)

//定义一个特征，跟数据库打交道，做增删改查
trait UserDao {
  //定义自身类型为user,表示继承UserDat特征的子类，必须有User的属性
  _: User =>

  //向数据库插入一条用户信息
  def insert(): Unit = {
    println("insert into db:" + this.name)
  }
}

//实现子类
class MyUser(name: String, age: Int) extends User(name, age) with UserDao with java.io.Serializable {

}
