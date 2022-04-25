package OOPs

object abstractClass {

    // Main method
    def main(args: Array[String])
    {
      // objects of GFG class
      var obj = new GFG()
      obj.details()
    }


}

abstract class myAuthor
{

  // abstract method
  def details()
}

// GFG class extends abstract class
class GFG extends myAuthor
{
  def details()
  {
    println("Author name: Ankita Saini")
    println("Topic name: Abstract class in Scala")
  }
}
