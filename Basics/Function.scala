package Basics

object Function extends App {
  // basic operators
  val x = 3 + 5
  val xIsEven = x % 2 == 0
  val xIsOdd = !xIsEven
  println(xIsEven)
  println(xIsOdd)

  //normal function
  def aFunction(a : String,b : Int): String = {
  a + "" +b
  }
  println(aFunction("hello",6))

  def aBasic(c : String,d : String): String = {
    c + "" +d
  }
  println(aBasic("hi","bae"))

  //second example
  def aParameterFunction(): Int = 42
  println(aParameterFunction())

  //third function
  def aRepeatedFunction(a : String,n : Int): String = {
    if (n == 1) a else a + aRepeatedFunction(a , n-1)
  }
  // fourth example
  def heartyWelcome(name : String,age : Int): String = {
    "Hi" + name + "and i was" + age + "years old."

  }
}
