package com.yushan.chapter03

object TestOpt {
  def main(args: Array[String]): Unit = {
    //在Scala中其实是没有运算符的，所有运算符都是方法
    val i:Int = 1.+(1)
    //当调用对象的方法时，.可以省略
    val j:Int = 1+(1)
    //如果函数参数只有一个，或者没有参数()可以省略
    val k:Int = 1+1
    println(1.toString())
    println(1 toString())
    println(1 toString)
  }
}
