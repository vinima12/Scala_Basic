package OOPs

object operatorPrecedence
{
    // Main method
    def main(args: Array[String])
    {

      var a:Int = 20;
      var b:Int = 10;
      var c:Int = 15;
      var d:Int = 5;
      var e = 0

      // operators with the highest precedence
      // will operate first
      e = a + b * c / d;

      /* step 1: 20 + (10 * 15) /5
          step 2: 20 + (150 /5)
      step 3:(20 + 30)*/

      println("Value of a + b * c / d is : " + e )

    }


}
