package Basics

object Expressions extends App{
  val x = 1 + 3
  println(x)
  println(2 + 3 * 4)
  println(1 == x)

  var aVariable = 2
  aVariable += 3
  println(aVariable)
  //if expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 7 else 3
  println(aConditionedValue)
  println(if(aCondition)5 else 3)
  print(1 + 3)

  //while expression
  var i = 0
  while (i <= 10){
    println(i)
    i += 1
  }
  //code block
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if ( z > 2) "hello" else "goodbye"
  }


}
