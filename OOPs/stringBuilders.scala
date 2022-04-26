package OOPs

object stringBuilders {
  def main(args: Array[String])
  {

    // Creating StringBuilder
    val x = new StringBuilder("Number of Contributors : ");

    // Appending String
    // representation of number
    val y = x.append(800)

    // Displays the string after
    // appending the number
    println(y)

    val a = new StringBuilder("Hello")

    // Resetting the content
    val b = x.clear()
  }
}
