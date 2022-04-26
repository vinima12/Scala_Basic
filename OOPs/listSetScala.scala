package OOPs
import scala.collection.immutable._
object listSetScala {
  // Main method
  def main(args:Array[String])
  {
    println("Initializing an immutable ListSet ")

    // Creating ListSet
    val listSet1: ListSet[String] = ListSet("Vinitha Vikram",
      "Tired", "Scala")
    println(s"Elements of listSet1 = $listSet1")
  }
}
