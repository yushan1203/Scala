package com.yushan.chapter04

import scala.io.StdIn

object TestIfElse {
  def main(args: Array[String]): Unit = {
    println("input age:")
    //Scala中返回值类型不一致，取它们共同的祖先类型
    var age = StdIn.readShort()
    val res:Any = if(age<18){
      "童年"
    }else if(age>=18&&age<30){
      "中年"
    }else{
      100
    }
    println(res)
    //如果大括号{}内的逻辑代码只有一行，大括号可以省略
    //如果省略大括号，if只对最近的一行逻辑代码起作用
    println("input age1")
    var age1 = StdIn.readInt()
    val res1:Any = if(age1<18) "童年" else "成年"
    println(res1)
    //嵌套分支
    println("input age2")
    var age2 = StdIn.readInt()

    val res2 :String = if (age2 < 18){
      "童年"
    }else {
      if(age2>=18 && age2<30){
        "中年"
      }else{
        "老年"
      }
    }

    println(res2)
  }

}
