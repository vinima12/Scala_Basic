package OOPs

object MethodNotation  extends  App{
  class Person ( val name : String, favouriteFood : String, age : Int){
    def likes(food :String): Boolean = food == favouriteFood
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickName : String): Person = new Person(s"$name($nickName)",favouriteFood)
    def unary_! : String = s"$name, what is the ..?"
    def unary_+ : Person= new Person(name, favouriteFood, age + 1)
    def isAlive : Boolean = true
    def apply() : String = s"Hi my name is $name and my fav food is $favouriteFood"
    def apply(n : Int):String = s"$name eating  $favouriteFood"
    def learns(thing : String) = s"$name is learning $thing"
    def learnScala = this learns "Scala"
  }
    val vini = new Person("mini","meals")
    println(vini.likes("meals"))
  println(vini.likes("meals"))

  //operators
  val cherry = new Person("Cherry","Something")
  println(vini + cherry)
  println(vini.+(cherry) )

  println(1 + 2)
  println(1.+(2))

  //all operators are method

  //prefix notation
  val x = -1
  val y = 1.unary_-

  //unary only works with the + - ! ~

  println(!vini)
  println(vini.unary_!)

  //postfix notation
  println(vini.isAlive)

  //apply ()
  println(vini.apply())
  println(vini()) //equal

println(vini + "crazy doll")
println((+vini).age)
  println(vini learnScala)
}
