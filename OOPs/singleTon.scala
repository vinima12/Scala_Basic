package OOPs

import OOPs.singleTon.AreaOfRectangle

object singleTon {

  def main(args: Array[String])
  {

    // Creating object of AreaOfRectangle class
    var obj = new AreaOfRectangle();
    obj.area();
  }
}

  class AreaOfRectangle
  {

    // Variables
    var length = 20;
    var height = 40;

    // Method which gives the area of the rectangle
    def area()
    {
      var ar = length * height;
      println("Height of the rectangle is:" + height);
      println("Length of the rectangle is:" + length);
      println("Area of the rectangle is :" + ar);
    }
  }

  // singleton object


