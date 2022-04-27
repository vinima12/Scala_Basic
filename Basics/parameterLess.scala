package Basics


  class vinithaVikram(name: String, ar: Int)
  {
    // A parameterless method
    def author = println(name)
    def article = println(ar)

    // An empty-parenthesis method
    def printInformation() =
    {
      println("User -> " + name + ", Articles -> " + ar)
    }
  }
  object parameterLess {
    def main(args: Array[String])
    {

      // Creating object of Class 'Geeksforgeeks'
      val win = new vinithaVikram("John", 50)
      win.author     // calling method without parenthesis
    }
  }
