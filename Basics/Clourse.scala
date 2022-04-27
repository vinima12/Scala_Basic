package Basics

object Clourse {

  // Main method
  def main(args: Array[String])
  {
    println( "Final_Sum(1) value = " + sum(1))
    println( "Final_Sum(2) value = " + sum(2))
    println( "Final_Sum(3) value = " + sum(3))


    var employee = 50

    // define closure function
    val vini = (name: String) => println(s"Company name is $name"+
      s" and total no. of employees are $employee")

    vini("diggiByte")

  }

  var a = 4

  // define closure function
  val sum = (b:Int) => b + a





}
