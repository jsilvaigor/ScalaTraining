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

  // Symbolic methods

  // Concatenating two arrays inside a new array
  arr ++ arr2
  arr ++: arr2

  // Adding items to the beginning and end of an array
  2 +: arr2 :+ 2

  arr.size
  arr.length

  arr.head
  arr.last

  // Returns a new array without the head
  arr.tail

  // Returns a new array without the 3 first items
  arr2.drop(3)

  // Returns a new array containing the 3 first items
  arr2.take(3)

  arr.reverse

  // Returns a tuple with two new arrays
  val (before, after) = arr2.splitAt(4)

  arr2.slice(3, 6)

  arr.isEmpty
  arr.nonEmpty

  arr.startsWith(Array(1, 2))
  arr.endsWith(Array(2, 3))

  arr.indexOf(2)

  arr2.indices

  arr.max
  arr.min

  arr.sum

  arr.product

  lst.toArray
  lst.toArray

  // Parallel array to parallel programing
  arr.par

  val list = (1 to 1000).toList
  list.map(_ + 42)
  list.par.map(_ + 42)

  // Returns a new list
  lst.updated(1, 99)

  arr2.patch(2, Array(1, 2, 3), 3)

  val arr4 = Array(1, 2, 3, 4, 5, 6, 7)

  arr4.intersect(arr)

  arr.union(arr4)

  arr4.diff(arr)

  arr.union(arr4).distinct

  arr4.mkString(", ")
  arr4.mkString("(", ", ", ")")

  arr4.view

  arr4.zip(arr2)

  arr4.zipWithIndex

}