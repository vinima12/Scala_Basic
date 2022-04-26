package OOPs
import scala.collection.immutable._
object listScala {

  def main(args:Array[String])
  {
    // Creating and initializing immutable lists
    val myList1: List[String] = List("vinitha", "vinoth", "vikram", "dhanalashmi")
    val myList2 = List("C", "C#", "Java", "Scala",
      "PHP", "Ruby")

    // Display the value of mylist1
    println("List 1:")
    println(myList1)

    // Display the value of mylist2 using for loop
    println("\nList 2:")
    for(mylist<-myList2)
    {
      println(mylist)
    }

    val emptyList: List[Nothing] = List()
    println("The empty list is:")
    println(emptyList)
  }

}
