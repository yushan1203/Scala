package com.yushan.chapter02

object TestDataType {
  def main(args: Array[String]): Unit = {
    //整型
    //1.Byte类型
    //正确
    var n1:Byte = 127
    var n2:Byte = -128
    //错误
    //var n3:Byte = 128
    //var n4:Byte = -129
    //默认为Int型，声明Long型，须加"l"或"L"
    var n5 = 10
    println(n5)
    var n6 = 9223372036854775807L
    println(n6)
    //2.浮点型，默认为Double型，声明Float型常量，加"f"或"F"
    //使用高精度小数时，选择Double
    var n7 = 2.2345678912f
    var n8 = 2.2345678912
    println("n7="+n7)
    println("n8="+n8)
    //3.字符常量
    var c1:Char = 'a'
    println("c1="+c1)
    //注意：这里涉及自动类型提升，其实编译器可以自定判断是否超出范围，不过idea提示报错
    //var c2:Char = 'a'+1//报错
    //\t：一个制表位，实现对齐功能
    println("姓名\t年龄")
    //\n：换行符
    println("乔峰\n阿朱")
    //\\：表示\
    println("c:\\天龙八部\\乔峰")
    //\"：表示“
    println("鲁迅说：\"真正的勇士，敢于直面惨淡的人生，敢于正视淋漓的鲜血\"")
    //4.布尔类型
    var isResult:Boolean = false
    var isResult2:Boolean = true
    //其他类型
    //1.Unit类型用来标识过程，也就是没有明确返回值的函数，类似于void
    def sayOk:Unit = {// unit表示没有返回值，即void
    }
    println(sayOk)
    //2.Null类只有一个实例对象，Null类似于Java中的null引用
    //Null可以赋值给任意引用类型（AnyRef），但是不能赋值给值类型（AnyVal）
    var person = new Person()
    person=null
    println(person)
    //var n1:Int = null//错误
    println("n1:"+n1)
    //3.Nothing，可以作为没有正常返回值的方法的返回类型，非常直观的告诉你这个方法不会正常返回
    //而且由于Nothing是其他任意类型的子类，他还能跟要求返回值的方法兼容。
    def test():Nothing = {
      throw new Exception()
    }
    test
  }
}
