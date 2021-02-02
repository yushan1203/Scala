package com.yushan.chapter04

object TestFor {
  def main(args: Array[String]): Unit = {
    //范围前后闭合
    for(i <- 1 to 5){
      println("我爱scala"+i)
    }
    //范围前闭后开
    for(i <- 1 until 6){
      println("我爱scala"+i)
    }
    //循环守卫，即循环保护式，保护式为true则进入循环体内部，为false则跳过
    for(i <- 1 to 5 if i != 3){
      println(i+"乔峰")
    }
    //循环步长，by表示步长
    for(i <- 1 to 10 by 2){
      println("i="+i)
    }
    //嵌套循环
    for(i <- 1 to 3;j <- 1 to 3){
      println("i="+i+"j="+j)
    }
    //引入变量
    for(i <- 1 to 3;j = 4-i){
      println("i="+i+"j="+j)
    }
    //循环返回值
    //将遍历过程中处理的结果返回到一个新Vector集合中，使用yield关键字
    var res = for(i <- 1 to 10) yield{
      i*2
    }
    println(res)
    //倒序打印
    for(i <- 1 to 10 reverse){
      println(i)
    }
  }
}
