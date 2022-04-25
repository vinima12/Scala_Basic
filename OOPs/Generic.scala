package OOPs

object Generic {


    // Main method
    def main(args: Array[String])
    {

      // Class structure for Generic
      // types
      abstract class Divide[z]
      {
        // Defining method
        def divide(u: z, v: z): z
      }

      // Extending Generic class of
      // type parameter Int
      class intDivide extends Divide[Int]
      {
        // A method returning Int
        def divide(u: Int, v: Int): Int = u / v
      }

      // Extending Generic Class of
      // type parameter Double
      class doubleDivide extends Divide[Double]
      {
        // A method returning Double
        def divide(u : Double, v : Double) : Double = u / v
      }

      // Creating objects and assigning
      // values to the methods called
      val q = new intDivide().divide(25, 5)
      val r = new doubleDivide().divide(21.0, 5.0)

      // Displays output
      println(q)
      println(r)

    }


}
