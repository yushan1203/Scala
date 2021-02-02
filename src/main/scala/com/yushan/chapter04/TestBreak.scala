package com.yushan.chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks._

object TestBreak {
  def main(args: Array[String]): Unit = {
    //1.采用异常的方式退出循环
    try{
      for (elem<-1 to 10){
        println(elem)
        if(elem==5) throw new RuntimeException
      }
    }catch{
      case e =>
    }
    println("正常结束循环")
    //2.采用scala自带函数退出循环
    Breaks.breakable(
      for (elem <- 1 to 10){
        println(elem)
        if(elem==5) Breaks.break()
      }
    )
    println("正常结束循环")
    //3.对break进行省略
    breakable{
      for (elem <- 1 to 10) {
        println(elem)
        if (elem == 5) break
      }
    }
    println("正常结束循环")
    //4.循环遍历10以内的所有数据，奇数打印，偶数跳过（continue）
    for(elem<-1 to 10){
      if(elem%2==1){
        println(elem)
      }else{
        println("continue")
      }
    }
    //5.多重循环
    for(i <- 1 to 9){
      for(j <- 1 to i){
        print(j+"*"+i+"="+(i*j)+"\t")
      }
      println()
    }
  }
}
