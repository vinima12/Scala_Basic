package OOPs

object OOPsBasic  extends App{
  val person = new Person("John", 22)
  println(person.x)
  person.crazy("Vikram")
  person.crazy()

  val author = new Writer("Dickens","bby", 1999)
  val imposter = new Writer("Dickens","bby", 1999)
  val novel = new Novel("Great Learning", 1998, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.inc.print
  counter.inc.inc.inc

}
class Person(name : String, val age : Int){
  val x = 2
  println(1 + 3)

  //method
  def crazy(name : String): Unit = println(s"${this.name} says : Hi, $name")
  // method overloading
  def crazy(): Unit = println(s"Hi, I am $name")
  // multiple constructors
  def this(name : String) = this(name, 0)
  def this()= this("Shamla Vikram")
}

class Writer(Firstname :String, Surname : String,val Year : Int){
  def fullName :  String = Firstname + "" + Surname
}
class Novel(name : String,val Year : Int, author: Writer){
  def authorAge= Year - author.Year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear : Int): Novel = new Novel(name, newYear, author)
}
class Counter(val count : Int){
  def inc ={
    println("incrementing")
    new Counter(count + 1)
  }

  def dec = {
    println("Decrementing")
    new Counter(count - 1)
  }
  def inc(n : Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }
  def dec(n : Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }
  def print = println(count)
}
