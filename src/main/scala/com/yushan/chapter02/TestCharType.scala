package com.yushan.chapter02

object TestCharType {
  def main(args: Array[String]): Unit = {
    var name:String = "linghuchong"
    var age:Int = 18
    //1.字符串，通过+号连接
    println(name+" "+age)
    //2.printf，通过%传值
    printf("name=%s age=%d\n",name,age)
    //3.字符串通过$引用
    //多行字符串，在Scala中，利用三个引号包围多行字符串就可以实现
    //输入的内容，带有空格、\t之类，导致每一行的开始位置不能整洁对齐
    //应用scala的stripMargin方法，在scala的stripMargin默认是"|"作为连接符，
    //在多行换行的行头前面加一个"|"符号即可
    val s =
      """
        |select
        | name,
        | age
        |from user
        |where name="zhangsan"
      """.stripMargin
    println(s)
    //如果需要对变量进行运算，那么可以加${}
    val s1=
      s"""
         |select
         |  name,
         |  age
         |from user
         |where name = "$name" and age=${age+2}
       """.stripMargin
    println(s1)

    val s2 = s"name=$name"
    println(s2)
  }
}
