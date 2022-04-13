package OOPs

object Objects  extends App{
  object Person{
    val eyes = 2
    def canFly: Boolean= false
  }

  class Person{
    //instance level functionality
  }
  //companions
println(Person.eyes)
  println(Person.canFly)

  val vini = Person
  val vino= Person
  println(vini == vino)

  val person1 = Person
  val person2 = Person
  println( person1 == person2)
}
