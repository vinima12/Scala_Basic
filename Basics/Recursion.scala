package Basics

object Recursion extends App {
  def factorial(n : Int): Int = {
    if(n<=0) 1 else n + factorial(n - 1)
  }
  println(factorial(7))
  def fibonacci(n : Int): Int = {
    if(n<=2) 1 else fibonacci(n-1) + fibonacci(n-2)
      }
  println(fibonacci(8))
// Recursion
  def  afactorial(n : Int): Int = {
    if (n<=1)1 else {
      println("computing factorial" + n + "Need factorial" + (n-1))
    }
    val result= n*factorial(n-1)
    println("computed factorial of" + n)
    result
  }
  println(factorial(10))
  println(factorial(5000))
}
