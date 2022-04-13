package Basics

object CBNCBV  extends App{
  def CalledByValue (x : Long): Unit ={
    println("by Value" + 123456789L)
    println("by Value" + 123456789L)
  }
def CalledByName(x: => Long): Unit = {
  println("By Name" + x)
  println("by Name" + x)
}
  CalledByName(System.nanoTime())
  CalledByValue(1234577896L)

  def CallByName(x : =>Long): Unit={
    println("by name" + System.nanoTime())
    println("by value" + System.nanoTime())
  }
  CalledByValue(123456789L)
  CalledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x : Int, y : =>Int) = println(x)
  printFirst(34, infinite())
}
