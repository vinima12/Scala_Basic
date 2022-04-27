package Basics

import scala.annotation.tailrec

object tailRecursion {
  // Function defined
  def Go(n: Int, m: Int): Int =
  {
    // tail recursion function defined
    @tailrec def gcd(x:Int, y:Int): Int=
    {
      if (y == 0) x
      else gcd(y, x % y)
    }
    gcd(n, m)
  }

  // Main method
  def main(args:Array[String])
  {
    println(Go(12, 18))
  }

}
