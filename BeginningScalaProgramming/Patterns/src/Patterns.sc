object Patterns {

  val strs = "Welcome to the Scala Worksheets".split(" ")

  val lst = List(1, 2, 3, 4, 5)

  val Array(hour, minute, second) = "17:37:50".split(":")

  def listLength(lst: List[Int]): Int = lst match {
    case Nil => 0
    case h :: t => 1 + listLength(t)
  }

  listLength(lst)

  lst.find(_ > 2) match {
    case None => "Not Found"
    case Some(i) => s"Found $i"
  }

  case class Person(name: String, age: Int)

  val people = Array(Person("Jose", 23), Person("Maria", 21))

  val Person(n, a) = people(0)

}