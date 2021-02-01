package com.yushan.chapter01

//scala没有静态语法，所以用object实现类似静态方法的功能
//伴生对象单例
object Hello {
  def main(args: Array[String]): Unit = {
    println("hello scala")
    System.out.println("hello scala")
  }
}
