package com.yushan.chapter02

object TestVar {
  def main(args: Array[String]): Unit = {
    //1.声明变量时，类型可以省略，编译器自动推导，即类型推导
    var age = 18
    age = 30
    //2.类型确定后，就不能修改，说明scala是强类型语言
    //age = "tom"//类型错误
    //3.变量声明时，必须要有初始值
    //var name//错误
    //4.在声明或定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改
    var num1 = 10//可变
    val num2 = 20//不可变

    num1 = 30
    //num2 = 100//错误，num2是val修饰的
    //5.var修饰的对象引用可以改变，val修饰的对象则不可改变，但对象的状态（值）却是可以改变的
    //比如自定义对象，数组，集合等
    //p1是var修饰的，p1的属性可以变，而且p1本身也可以变
    var p1 = new Person()
    p1.name = "xuzhu"
    p1 = null
    //p2是val修饰的，那么p2本身就不可变（即p2的内存地址不能变），但是p2的属性是可以变的，因为属性并没有用val修饰
    val p2 = new Person()
    p2.name = "duanyu"
    //p2 = null//错误的，因为p2是val修饰的
  }
}

