package Basics
  class doctor{
// function 1 with two parameters
def fun(p:Int, q:Int)
  {
  var Sum = p + q;
  println("Sum in function 1 is:" + Sum);
  }

  // function 2 with three parameters
  def fun(p:Int, q:Int, r:Int)
  {
  var Sum = p + q + r;
  println("Sum in function 2 is:" + Sum);
  }
  }
object overLoading {


  // Main function
  def main(args: Array[String])
  {

    // Creating object of doctor class
    var obj = new doctor();
    obj.fun(6, 8);
    obj.fun(5, 10, 58);
  }

}
