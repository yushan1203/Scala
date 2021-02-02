package com.yushan.chapter03

object TestRelation {
  def main(args: Array[String]): Unit = {
    // 测试：>、>=、<=、<、==、!=
    var a:Int = 2
    var b:Int = 1

    println(a>b)//true
    println(a>=b)//true
    println(a<=b)//false
    println(a<b)//false
    println("a==b"+(a==b))//false
    println(a!=b)//true

    //Java和Scala中关于==的区别
    val s1 = "abc"
    val s2 = new String("abc")

    //==比较字符串中所包含的内容是否相同
    //eq比较两个变量本身的值，即两个对象在内存中的首地址
    //java是相反的
    println(s1==s2)//true
    println(s1.eq(s2))//false
  }
}
