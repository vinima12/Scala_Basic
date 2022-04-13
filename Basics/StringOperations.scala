package Basics

object StringOperations  extends App{
  val str : String = "Hi Crazydoll"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split("").toList)
  println(str.startsWith("Hi"))
  println(str.toLowerCase())
  println(str.length)
  val aNumberString = "2"
  val aNumber =  aNumberString.toInt
  println("a" +: aNumberString :+ "z")
  println(str.reverse)
  println(str.take(2))

  //scala specific
  val name = "Daniel"
  val age =  22
  val crazy = s"hi iam $name and my age is $age"
    val crazyDoll = s"hi iam  $name and my age is ${age + 1}"
  val speed = 1.2f
  val aName = "Daniel"
  println(f"$aName%s can eat $speed%2.2f chips per minute")
//raw Interpolators
  println(raw"this is a \n newline")
  val escaped= "this is  \n newline"
  println(raw"$escaped")


}
