package OOPs

object ArrayInScala {
  // Main method
  def main(args: Array[String])
  {
    // allocating memory of 1D Array of string.
    var days = Array("Sunday", "Monday", "Tuesday",
      "Wednesday", "Thursday", "Friday",
      "Saturday" )
    println("days"+days)

    println("Array elements are : ")
    for ( v <-days )
    {
      println(v )
    }

  }

}
