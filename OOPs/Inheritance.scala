package OOPs

object Inheritance  extends App {

  class flower {
    protected def smell = println("nomnm")
  }

  class like extends flower {
    def crack = {
      smell
      println("crack crack")
    }
  }

  val lilly = new like
  lilly.crack
}
