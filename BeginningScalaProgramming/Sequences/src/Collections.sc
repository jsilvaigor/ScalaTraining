object Collections {

  val arr = Array(1, 2, 3)

  val lst = List(7.2, 4, 9)

  arr(0)

  lst(2)

  arr(0) = 99

  arr

  //adding item to list the head
  val lst2 = 1 :: lst

  lst

  val arr2 = Array.fill(10)(math.random())

  def littleArray(i: => Int) = Array(i, i, i)

  littleArray(5)

  littleArray(util.Random.nextInt(10))

  val arr3 = Array.tabulate(10)(i => i * i)

  Vector(1, 2, 3)

  import collection.mutable

  mutable.Buffer(1, 2, 3)

  1 to 10 by 2

  0.1 to 1 by 0.1

  10 to 1 by -1
}