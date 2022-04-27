package Basics

object namedArguments {
  // Main method
  def main(args: Array[String])
  {
    // passed with named arguments
    printInteger(X = 6, Y = 8);
  }

  // Defining a method
  def printInteger( X:Int, Y:Int ) =
  {
    println("Value of X : " + X );
    println("Value of Y : " + Y );
  }
}
