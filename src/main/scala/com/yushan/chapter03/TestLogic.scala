package com.yushan.chapter03

object TestLogic {
  def main(args: Array[String]): Unit = {
    //测试：&&、||、!
    var a = true
    var b = false

    println("a&&b="+(a&&b))//false
    println("a||b="+(a||b))//true
    println("!(a&&b)="+(!(a&&b)))//true
  }
}
