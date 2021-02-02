package com.yushan.chapter04

object TestWhile {
  def main(args: Array[String]): Unit = {
    //while循环
    var i = 0
    while(i<10){
      println("乔峰"+i)
      i+=1
    }
    //do...while循环
    var j = 0
    do {
      println("令狐冲"+j)
      j+=1
    }while(j<10)
  }
}
