package OOPs

class speak
{

  // Inner class
  class G1
  {
    var a = 0
    def method()
    {
      for(a<-0 to 3)
      {
        println("Welcome to inner class: G1");
      }
    }
  }
}
object innerClass
{
  def main(args: Array[String])
  {

    // Creating object of the outer and
    // inner class Here, G1 class is
    // bounded with the object of Geek class
    val obj = new speak();
    val o = new obj.G1;
    o.method();
  }
}
