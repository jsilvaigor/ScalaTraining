object FirstScalaWorksheet {
  println("Hello Scala Worksheet World!")

  42

  4.2

  42.toString

  4.2.toString

  "4.2".toDouble

  null

  true

  ()

  val a = 42

  val b = 42

  val thisIsAVariable = 42

  val theAnswer = 42

  var c: Int = 42

  val (d, e) = (4, 2)

  (4, 2)
  (4.2, 'a')
  (4, 4.2, "hi")

  if (a < 100) println("less")

  if (a > 100) println("greater")

  val next = if (a % 2 == 0) a / 2 else 3 * a + 1

  if (a < 100) "Hi" else ()

  val result = a match {
    case 0 => "zero"
    case 13 => "thirteen"
    case `b` => "Same as b"
    case i => "Wow! This is big!, " + i
  }

  val resultTuple = (a + 1, b) match {
    case (0, _) => "zero"
    case (_, 13) => "thirteen"
    case i => "Wow! This is big!, " + i
  }

  def square(x: Double): Double = x * x

  square(5)

  def greet(name: String): Unit = {
    println(s"Hello, $name")
  }

  greet("Igor")
}