package Basics

object partiallyFunction {

  def main(args: Array[String])
  {

    // Creating a Partially applied
    // function
    def Book(discount: Double, costPrice: Double)
    : Double =
    {

      (1 - discount/100) * costPrice

    }

    // Applying only one argument
    val discountedPrice = Book(25, _: Double)

    // Displays discounted price
    // of the book
    println(discountedPrice(400))

  }


}
